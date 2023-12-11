import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //List to store the students
        List<Student> students = new ArrayList<>();

        Student student1 = new Student("S001", "Eduardo", 32);
        student1.addCourse("Math");
        student1.addCourse("Physics");
        students.add(student1);

        Student student2 = new Student("S002", "Silvana", 31);
        student2.addCourse("Computer Science");
        student2.addCourse("Math");
        students.add(student2);

        Student student3 = new Student("S003", "Bruno", 21);
        student3.addCourse("Computer Science");
        student3.addCourse("History");
        students.add(student3);

        // Display details of all students for each student will invoke the method displayStudent Info
        System.out.println("Details of all students:");
        students.forEach(Student::displayStudentDetails);

        // Students enrolled in a certain course (CS as per instructions)
        System.out.println("\nStudents enrolled in Computer Science:");
        students.stream()
                .filter(student -> student.getCourses().contains("Computer Science"))
                .forEach(Student::displayStudentDetails);

        // Update age of a specific student
        updateAge(students, "S002", 23);

        // Calculating the average of all student
        double averageAge = students.stream()
                .mapToInt(Student::getAge)
                .average()
                .orElse(0.0);
        System.out.println("\nAverage age of all students: " + averageAge);
    }

    //this methods uses streams to update the age of students.
    public static void updateAge(List<Student> students, String studentId, int newAge) {
        students.stream()
                .filter(student -> student.getStudentId().equals(studentId))
                .findFirst()
                .ifPresent(student -> student.setAge(newAge));
    }


}
