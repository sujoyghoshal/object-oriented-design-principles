import java.util.ArrayList;

class Faculty {
    String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void displayFaculty() {
        System.out.println("Faculty: " + name);
    }
}

class Department {
    String name;
    ArrayList<Faculty> faculties;

    public Department(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void displayDepartment() {
        System.out.println("Department: " + name);
        for (Faculty f : faculties) {
            f.displayFaculty();
        }
    }
}

class University {
    String name;
    ArrayList<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayUniversity() {
        System.out.println("University: " + name);
        for (Department d : departments) {
            d.displayDepartment();
        }
    }
}

public class UniversityComposition {
    public static void main(String[] args) {
        University uni = new University("XYZ University");
        Department cs = new Department("Computer Science");
        Department ee = new Department("Electrical Engineering");

        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. Johnson");

        cs.addFaculty(f1);
        ee.addFaculty(f2);

        uni.addDepartment(cs);
        uni.addDepartment(ee);

        uni.displayUniversity();
    }
}
