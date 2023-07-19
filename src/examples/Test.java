package examples;

class Test{
    void myMethod(){
        System.out.println("InterviewBit");
    }
}

class Derived extends Test{
    void myMethod(){
        System.out.println("IB");
    }

    public static void main(String[] args){
        Test object = new Derived();
        object.myMethod();
    }
}