package builder;

public class builder_SesignPattern {
    private int mark;
    private int age;
    public int getAge() {
        return age;
    }
    public  int getMark(){
        return mark;
    }

    public void setMark(int mark) {
        if(mark>50 && age>70){
//            this.age=80;
            System.out.println("Gggggggg");
            this.mark = mark;
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        builder_SesignPattern bs = new builder_SesignPattern();
        bs.setMark(62);
        System.out.println(bs.getMark());
        System.out.println(bs.getAge());
    }
}

