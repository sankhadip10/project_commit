package Threads;

public class Main {
    public static void main(String[] args) {
        helloworldprinter hwp=new helloworldprinter();
//        hwp.run();
        Thread t1=new Thread(hwp);
        t1.start();
        System.out.println();
    }
}
