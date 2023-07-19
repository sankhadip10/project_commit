package Threads;

public class client {
    public static void main(String[] args) {
        for (int i=1;i <= 100;i++) {
            printonetohundred pt = new printonetohundred(i);
            Thread t =new Thread(pt);
            t.start();
        }

    }
}
