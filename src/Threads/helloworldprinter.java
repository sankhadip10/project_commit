package Threads;

public class helloworldprinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello world "+Thread.currentThread().getName());

    }
}
