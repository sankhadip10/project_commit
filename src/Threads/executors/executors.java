package Threads.executors;

public class executors implements Runnable {
    private int number;


    public executors(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Number " + number + " printed by " + Thread.currentThread().getName());
    }
}
