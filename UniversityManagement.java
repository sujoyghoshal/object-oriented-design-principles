import java.util.ArrayList;

class Course {
    String name;

    public Course(String name) {
        this.name = name;
    }
}

class Professor {
    String name;

    public Professor(String name) {
        this.name = name;
    }

    public void assignCourse(Course course) {
        System.out.println("Professor " + name + " is assigned to course: " + course.name);
    }
}

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(Course course) {
        System.out.println("Student " + name + " enrolled in " + course.name);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Professor p1 = new Professor("Dr. Smith");
        Course c1 = new Course("Math");

        s1.enrollCourse(c1);
        p1.assignCourse(c1);
    }
}
