import java.util.ArrayList;
import java.util.List;

public class Student {

    //attributes
    private String studentId, name;
    private int age;
    private List<String> courses;


    //constructor
    public Student(String id, String name, int age){
        this.studentId = id;
        this.name = name;
        this.age = age;
        this.courses = new ArrayList<>();
    }

    //added this method just to add courses to the list
    public void addCourse(String course) {
        courses.add(course);
    }

    //Method to display the information of the student
    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Courses: " + courses);
    }
//getters and setter for common definition, some of them will be not used.
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
} // end of class
