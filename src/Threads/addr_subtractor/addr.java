package Threads.addr_subtractor;

import java.util.concurrent.locks.Lock;

public class addr implements Runnable{
    private count count;

    private Lock lock;

    public addr(count count, Lock lock){
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i=1;i<=100000;i++){
            lock.lock();
            this.count.val +=i;
            lock.unlock();
        }
    }
}
