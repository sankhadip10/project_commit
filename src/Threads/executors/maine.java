package Threads.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class maine {
    public static void main(String[] args) {
        ExecutorService exe= Executors.newFixedThreadPool(10);
        for(int i=0;i<=100;i++){
            if(i==60){
                System.out.println("break");
            }
            executors e=new executors(i);
            exe.execute(e);
        }
    }
}
