package examples;

class IB
{
    protected void getData(){
        System.out.println("Inside IB");
    }
}

class InterviewBit extends IB{
    protected void getData(){
        System.out.println("Inside InterviewBit");
    }
}


class Test1{
    public static void main(String[] args){
        IB obj = new InterviewBit();
        obj.getData();
    }
}