package builder;

public class Client {
    public static void main(String[] args) throws Exception {
//        Builder b = new Builder();
//        Builder b = Student.getBuilder();
//        b.setName("Sankha");
//        b.setAge(10);
//        b.setGender("M");
//        b.setPsp(85);
//
//        if (!b.validate()) {
//            throw new Exception("ERROR");
//        }
//
//        Student st = new Student(b);

        //Method Chaining
//        student.getBuilder().setName(naman).setAg(24).setGender(Male).build();
        Student s = Student.getBuilder().setAddress("House no 10101").setPsp(87.0).setName("Sankha").setGender("Male").build();
//        Student s2 = new Student(null);
    }

}
