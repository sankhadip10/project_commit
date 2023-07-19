package Threads.addr_subtractor_implicit_method;

public class addr implements Runnable{
    private Threads.addr_subtractor_implicit_method.count count;


    public addr(Threads.addr_subtractor_implicit_method.count count){
        this.count = count;
    }

    @Override
    public void run() {
        for (int i=1;i<=100000;i++){
                count.add(i);
        }
    }
}
