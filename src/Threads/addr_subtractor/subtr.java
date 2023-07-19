package Threads.addr_subtractor;

import java.util.concurrent.locks.Lock;

public class subtr implements Runnable{
    private count count;
    private Lock lock;

    public subtr(count count,Lock lock){
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i=1;i<=100000;i++){
            lock.lock();
            this.count.val=this.count.val-i;
            lock.unlock();
        }
    }
}
