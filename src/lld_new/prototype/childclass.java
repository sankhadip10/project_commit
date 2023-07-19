package lld_new.prototype;
class Student {
    String name;
    int age;
    String gender;

    public Student() {
        // Default constructor
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}

class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent() {
        // Default constructor
    }

    public IntelligentStudent(String name, int age, String gender, int iq) {
        super(name, age, gender);
        this.iq = iq;
    }

    public int getIQ() {
        return iq;
    }

//    public void setIQ(int iq) {
//    }
}

public class childclass {
    public static void main(String[] args) {
        Student st1 = new IntelligentStudent("Alice", 20, "Female", 140);
        Student st2 = null;

        if (st1 instanceof Student) {
            st2 = new Student();
            st2.name = st1.getName();
            st2.age = st1.getAge();
            st2.gender = st1.getGender();
        } else if (st1 instanceof IntelligentStudent) {
            IntelligentStudent intelligentSt1 = (IntelligentStudent) st1;
            st2 = new IntelligentStudent();
            st2.name = intelligentSt1.getName();
            st2.age = intelligentSt1.getAge();
            st2.gender = intelligentSt1.getGender();
            // Retrieve IQ value from IntelligentStudent
//            int iq = intelligentSt1.getIQ();
//            ((IntelligentStudent) st2).setIQ(intelligentSt1.getIQ());
        }

        // Print the attributes of st2
        System.out.println("Name: " + st2.getName());
        System.out.println("Age: " + st2.getAge());
        System.out.println("Gender: " + st2.getGender());

        // Print the IQ value for IntelligentStudent st2
        if (st2 instanceof IntelligentStudent) {
            int iq = ((IntelligentStudent) st2).getIQ();
            System.out.println("IQ: " + iq);
        }
    }
}
