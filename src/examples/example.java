package examples;

interface Scaler{
    void myMethod();
    void getInfo();
}


abstract class IBs implements Scaler{

    void getData(){
        System.out.println("IB");
    }
}

public class example extends IBs{
    public void myMethod(){
        System.out.println("InterviewBit");
    }

    public void getInfo(){
        System.out.println("Scaler");
    }

    public static void main(String[] args){
        IBs obj = new example();
        obj.getInfo();
    }
}