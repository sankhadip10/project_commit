package Threads.addr_subtractor_implicit_method;

public class count {
    int val;

     synchronized void add (int value){
        val=val+value;
    }

    synchronized void sub(int value){
         val=val-value;
    }
}
