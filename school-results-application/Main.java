public class Main {
    public static void main(String[] args) {
        // Creating a student
        Student student = new Student("John");

        // Adding subjects
        student.addSubject(new Subject("Maths", 90));
        student.addSubject(new Subject("Science", 85));

        // Grade Calculation
        GradeCalculator calculator = new GradeCalculator();
        String grade = calculator.calculateGrade(student);

        // Displaying result
        System.out.println("Student: " + student.getName());
        for (Subject subject : student.getSubjects()) {
            System.out.println("Subject: " + subject.getName() + ", Marks: " + subject.getMarks());
        }
        System.out.println("Final Grade: " + grade);
    }
}
