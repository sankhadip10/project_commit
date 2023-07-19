package Threads.addr_subtractor_implicit;

import java.util.concurrent.locks.Lock;

public class addr implements Runnable{
    private Threads.addr_subtractor_implicit.count count;


    public addr(Threads.addr_subtractor_implicit.count count){
        this.count = count;
    }

    @Override
    public void run() {
        for (int i=1;i<=100000;i++){
            synchronized (count){
                this.count.val +=i;

            }
        }
    }
}
