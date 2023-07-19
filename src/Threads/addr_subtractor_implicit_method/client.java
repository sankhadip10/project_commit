package Threads.addr_subtractor_implicit_method;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.TimeUnit.MINUTES;

public class client {
    public static void main(String[] args) throws InterruptedException {
        count c = new count();
        c.val = 0;

//        Lock lock =new ReentrantLock();
        addr a =new addr(c);
        subtr s =new subtr(c);

        ExecutorService executeService = Executors.newCachedThreadPool();
        executeService.execute(a);
        executeService.execute(s);

        executeService.shutdown();
        executeService.awaitTermination(100L,
                MINUTES);

        System.out.println(c.val);
    }
}
