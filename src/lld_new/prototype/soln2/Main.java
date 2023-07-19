package lld_new.prototype.soln2;

public class Main {
    public static void main(String[] args) {
        Student st = null;
        Student copy;
        if (st instanceof IntelligentStudent) {
            copy = new IntelligentStudent((IntelligentStudent) st);//st is instance of IntelligentStudent so we are casting,eg dog is animal but animal is not dog
        } else if (st instanceof Student) {
            copy = new Student(st);
        }
    }
}
