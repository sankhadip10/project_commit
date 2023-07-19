package Threads.mergesorprac;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class sorter implements Callable<List<Integer>> {
    private List<Integer> arraysTosort;
    private ExecutorService executorService;

    public sorter(List<Integer> arraysTosort,ExecutorService executorService) {
        this.arraysTosort = arraysTosort;
        this.executorService= executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        //base codition
        if (arraysTosort.size() <= 1) {
            return arraysTosort;
        }

        int mid = arraysTosort.size() / 2;

        //get the left side of array
        List<Integer> leftArrayToSort = new ArrayList<>();
        for (int i = 0; i < mid; i++) {
            leftArrayToSort.add(arraysTosort.get(i));
        }

        //get the right side of the array
        List<Integer> rightArrayToSort = new ArrayList<>();
        for (int j = mid; j < arraysTosort.size(); j++) {
            rightArrayToSort.add(arraysTosort.get(j));
        }

//        ExecutorService es = Executors.newCachedThreadPool();

        sorter leftsorter = new sorter(leftArrayToSort,executorService);
        sorter rightsorter = new sorter(rightArrayToSort,executorService);

        Future<List<Integer>> leftSorterArrayFuture = executorService.submit(leftsorter);
        Future<List<Integer>> rightSorterArrayFuture = executorService.submit(rightsorter);

        //merge both the left sorted array and right sorted array
        List<Integer> sortedArray = new ArrayList<>();
        List<Integer> leftSortedArray = leftSorterArrayFuture.get();
        List<Integer> rightSortedArray = rightSorterArrayFuture.get();


        int i = 0;
        int j = 0;
        while (i < leftSortedArray.size() && j < rightSortedArray.size()) {
            if (leftSortedArray.get(i) <= rightSortedArray.get(j)) {
                sortedArray.add(leftSortedArray.get(i));
                i++;
            } else {
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }

        }
        while (i < leftSortedArray.size()) {
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }
        while (j < rightSortedArray.size()) {
            sortedArray.add(rightSortedArray.get(j));
            j++;
        }
        return sortedArray;

    }
}
