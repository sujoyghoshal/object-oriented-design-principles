import java.util.ArrayList;

class Student {
    private String name;
    private ArrayList<Subject> subjects;

    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public String getName() {
        return name;
    }
}
