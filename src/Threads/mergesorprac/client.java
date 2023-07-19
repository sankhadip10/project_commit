package Threads.mergesorprac;

import java.util.List;
import java.util.concurrent.*;

public class client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // The client class is the entry point of the program. It creates a list of integers called li
        // containing some unsorted numbers.

        List<Integer> li = List.of(
                1, 2, 3, 4, 5, 6, 7
        );
//        An ExecutorService named es is created using Executors.newCachedThreadPool().
//        This executor service is responsible for managing and executing the sorting tasks.

        ExecutorService es = Executors.newCachedThreadPool();

//        An instance of the sorter class is created, passing the li list as a parameter.
//        The sorter class implements the Callable interface, which allows it to be executed by
//        the executor service.
        sorter s = new sorter(li,es);
        Future<List<Integer>> sortedListFuture = es.submit(s);

        List<Integer> sortedList = sortedListFuture.get();
        for (Integer k : sortedList) {
            System.out.println(k);
        }

    }
}
