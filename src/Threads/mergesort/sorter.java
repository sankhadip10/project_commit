package Threads.mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class sorter implements Callable<List<Integer>> {
    private  List<Integer> arrayTosort;
    public sorter(List<Integer> arrayTosort){
        this.arrayTosort=arrayTosort;

    }

    @Override
    public List<Integer> call() throws Exception {
        if(arrayTosort.size()<=1){
            return  arrayTosort;
        }

        int mid=arrayTosort.size()/2;
        List<Integer> leftArrayToSort = new ArrayList<>();
        for(int i=0;i<mid;++i){
            leftArrayToSort.add(arrayTosort.get(i));
        }

        List<Integer> rightArrayToSort=new ArrayList<>();
        for(int i=mid;i<arrayTosort.size();i++){
            rightArrayToSort.add(arrayTosort.get(i));
        }

        ExecutorService executorService= Executors.newCachedThreadPool();

        sorter leftSorter = new sorter(leftArrayToSort);

        sorter rightSorter =new sorter(rightArrayToSort);

        Future<List<Integer>> leftSortedArrayFuture=executorService.submit(leftSorter);
        Future<List<Integer>> rightSortedArrayFuture=executorService.submit(rightSorter);

        List<Integer> sortedArray=new ArrayList<>();

        int i=0;
        int j=0;

        List<Integer> leftSortedArray = leftSortedArrayFuture.get();//if future is not yet done,code will wait till the time future is ready
        List<Integer> rightSortedArray=rightSortedArrayFuture.get();

        while(i<leftSortedArray.size() && j<rightSortedArray.size()){
            if(leftSortedArray.get(i)<=rightSortedArray.get(j)){
                sortedArray.add(leftSortedArray.get(i));
                i++;
            }
            else{
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }
        while(i<leftSortedArray.size()){
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }
        while (j<rightSortedArray.size()){
            sortedArray.add(rightSortedArray.get(j));
            j++;
        }

        return sortedArray;
    }
}
//mergesort(array){
//  leftArray=...;
//  rightArray=...;
//leftSortedArray=mergesort(leftArray);--do this in a thread
//rightSortedArray=mergesort(rightArray);--do this in a separate thread
//return merge(leftsortedArray,rightsortedArray);