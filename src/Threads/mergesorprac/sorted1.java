package Threads.mergesorprac;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class sorted1 implements Callable<List<Integer>> {
    private List<Integer> arrayList;

    public sorted1(List<Integer> arrayList){
        this.arrayList=arrayList;
    }

    @Override
    public List<Integer> call() throws Exception {
        //base condition
        if(arrayList.size()<=1){
            return arrayList;
        }

        int mid=arrayList.size()/2;

        List<Integer> leftArrayToSort = new ArrayList<>();
        for (int i=0;i<mid;i++){
            leftArrayToSort.add(arrayList.get(i));

        }

        List<Integer> rightArrayTosSort = new ArrayList<>();
        for (int j=mid;j<arrayList.size();j++){
            rightArrayTosSort.add(arrayList.get(j));

        }

        ExecutorService es= Executors.newCachedThreadPool();
        sorted1 leftSorter=new sorted1(leftArrayToSort);
        sorted1 rightSorter=new sorted1(rightArrayTosSort);

        Future<List<Integer>> futureArrayLeftList=es.submit(leftSorter);
        Future<List<Integer>> futureArrayRightList=es.submit(rightSorter);

        //Merge both the left sorter array
        List<Integer> array=new ArrayList<>();
        List<Integer> leftSortedArray=futureArrayLeftList.get();
        List<Integer> rightSortedArray=futureArrayRightList.get();

        int i=0;
        int j=0;
        while(i<leftSortedArray.size() && j<rightSortedArray.size()){
            if(leftSortedArray.get(i)<rightSortedArray.get(j)){
                array.add(leftSortedArray.get(i));
                i++;

            }
            else{
                array.add(rightSortedArray.get(j));
                j++;
            }
        }
        while(i<leftSortedArray.size()){
            array.add(leftSortedArray.get(i));
            i++;
        }
        while(j<rightSortedArray.size()){
            array.add(rightSortedArray.get(j));
            j++;
        }

        return array;
    }
}
