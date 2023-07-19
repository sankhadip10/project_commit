package arnav_threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//import java.util.concurrent.ExecutorService;

public class usingExecutors {
    public static void main(String[] args) {
        Executor executor =Executors.newCachedThreadPool();

        Runnable printThreadName=()->{
            for(int i=0;i<5;i++){
                System.out.println("count :"+i+"\t"+Thread.currentThread().getName());
            }
        };
//        executor.execute();
        for (int i = 0; i < 20; i++) {
            executor.execute(printThreadName);


        }
        ((ExecutorService) executor).shutdown();
    }
}
