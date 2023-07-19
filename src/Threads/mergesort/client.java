package Threads.mergesort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arraysToSort=List.of(
                10,2,8,11,4,3,9,1
        );

        ExecutorService es=Executors.newCachedThreadPool();
        sorter s=new sorter(arraysToSort);
        Future<List<Integer>> sortedListFuture=es.submit(s);


        List<Integer> sortedList=sortedListFuture.get();
        for (Integer in:sortedList){
            System.out.println(in);
        }
    }
}
