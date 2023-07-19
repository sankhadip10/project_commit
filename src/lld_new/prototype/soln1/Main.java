package lld_new.prototype.soln1;

public class Main {
    public static void main(String[] args) {
        Student st =new IntelligentStudent();
        Student copy;
        if (st instanceof IntelligentStudent){
            copy = new IntelligentStudent();
            //unable to access iq
            //unable to access private attribute

        }else if(st instanceof Student){
            copy=new Student();
            //unable to access private attribute
        }
//        copy.age=st.age;

    }


}
