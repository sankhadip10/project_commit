package Threads;

public class printonetohundred implements Runnable{
    private int number;
    public printonetohundred(int number){
        this.number=number;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(number == 60){
            System.out.println("Break");
        }
        System.out.println("Number: "+number+" Printed By "+Thread.currentThread().getName());
    }

}
