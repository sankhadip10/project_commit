package dataTyped;
class Pair{
    int a;
    int b;

    public int getFirst(){
        return a;
    }
    public int getSecond(){
        return b;
    }
    public void setFirst(int a){
        this.a=a;
    }
    public void setSecond(int b){
        this.b=b;
    }
}

class Pairs<T>{
    T a;
    T b;

    public T getFirst(){
        return a;
    }
    public T getSecond(){
        return b;
    }
    public void setFirst(T a){
        this.a=a;
    }
    public void setSecond(T b){
        this.b=b;
    }
}


public class Generics {
    public static void main(String[] args) {
        Pairs<Integer> p =new Pairs<Integer>();
        p.setFirst(10);
        p.setSecond(20);

        Pairs<String> p1 =new Pairs<String>();
        p1.setFirst("ssss");
        p1.setSecond("dddd");

        Pairs p2 =new Pairs();
        p2.setFirst("abc");
        p2.setSecond(20);
    }
}
