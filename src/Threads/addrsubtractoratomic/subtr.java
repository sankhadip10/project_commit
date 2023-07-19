package Threads.addrsubtractoratomic;

public class subtr implements Runnable{
    private Threads.addrsubtractoratomic.count count;

    public subtr(Threads.addrsubtractoratomic.count count){
        this.count = count;
    }

    @Override
    public void run() {

        for(int i=1;i<=100000;i++){
                count.val.addAndGet(-i);
        }
    }
}
