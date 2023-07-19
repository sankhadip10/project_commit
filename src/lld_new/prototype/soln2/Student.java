package lld_new.prototype.soln2;

public class Student {
    private String name;
    private int age;
    private String gender;

    public Student(Student other){
        this.name = other.name;
        this.age =other.age;
        this.gender =other.gender;
    }

}
