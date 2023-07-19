package HashMap;

public class EvenOddPrinter {
    private static final int MAX_NUMBER = 20;
    private static final Object monitor = new Object();

    private static volatile int number =1;

    public static void main(String[] args) {
        Thread evenThread = new Thread(()->printEvenNumber());
        Thread oddThread = new Thread(() -> printOddThread());

        evenThread.start();
        oddThread.start();
    }

    public static void printEvenNumber(){
        synchronized (monitor){
            while (number<=MAX_NUMBER){
                if(number%2==0){
                    System.out.println("Even: "+number);
                    number++;
                    monitor.notify();
                }
                else {
                    try {
                        monitor.wait();
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public static void printOddThread(){
        synchronized (monitor){
            while (number<=MAX_NUMBER){
                if(number % 2!=0){
                    System.out.println("Odd:"+number);
                    number++;
                    monitor.notify();
                }
                else {
                    try {
                        monitor.wait();
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}