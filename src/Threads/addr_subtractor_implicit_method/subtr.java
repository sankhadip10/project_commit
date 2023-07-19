package Threads.addr_subtractor_implicit_method;

public class subtr implements Runnable{
    private Threads.addr_subtractor_implicit_method.count count;

    public subtr(Threads.addr_subtractor_implicit_method.count count){
        this.count = count;
    }

    @Override
    public void run() {

        for(int i=1;i<=100000;i++){
                count.sub(i);
        }
    }
}
