package lld_new.prototype.sol3;

public class Main {
    public static void main(String[] args) {
        studentRegistry sr = new studentRegistry();

        // Adding students to the registry
        sr.addStudent("nov21BatchStud", new Student("Nov 21 Beginner"));
        sr.addStudent("aug22Inter", new Student("Aug 22 Inter"));

        // Finding a student in the registry by name
        String studentName = "aug22Inter";
        Student foundStudent = sr.getStudent(studentName);

        // Check if the student was found in the registry
        if (foundStudent != null) {
            // Student found, perform required operations
            System.out.println("Found Student: " + foundStudent.getName() + ", " + foundStudent.getBatch());

            // Create a copy of the found student
            Student copiedStudent = foundStudent.copy();
            copiedStudent.setName("Ujjwal");

            // Print details of the original and copied students
            System.out.println("Original Student: " + foundStudent.getName() + ", " + foundStudent.getBatch());
            System.out.println("Copied Student: " + copiedStudent.getName() + ", " + copiedStudent.getBatch());
        } else {
            // Student not found in the registry
            System.out.println("Student with name '" + studentName + "' not found in the registry.");
        }
    }
}
