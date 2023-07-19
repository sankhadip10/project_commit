package HashMap;

import Threads.executors.maine;

public class another {
    private static final int MAX_NUMBER =20;
    private static final Object monitor = new Object();

    private static volatile int number =1;

    public static void main(String[] args) {
        Thread t1 = new Thread(()->evenThread());
        Thread t2 = new Thread(()->oddThread());

        t1.start();
        t2.start();
    }

    public static void evenThread(){
        synchronized (monitor){
            while (number<=MAX_NUMBER){
                if(number%2==0){
                    System.out.println("EVEN :"+number);
                    number++;
                    monitor.notify();
                }
                else {
                    try {
                        monitor.wait();
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public static void oddThread(){
        synchronized (monitor){
            while (number<=MAX_NUMBER){
                if(number%2!=0){
                    System.out.println("ODD :"+number);
                    number++;
                    monitor.notify();
                }
                else {
                    try {
                        monitor.wait();
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
