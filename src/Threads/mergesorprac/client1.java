package Threads.mergesorprac;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class client1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list= List.of(
                2,3,4,6,74,32,455,55
        );

        ExecutorService es=Executors.newCachedThreadPool();

        sorted1 dd=new sorted1(list);
        Future<List<Integer>> sortedListFuture=es.submit(dd);

        List<Integer> sortedList=sortedListFuture.get();

        for(Integer ai:sortedList){
            System.out.println(ai);
        }


    }
}
