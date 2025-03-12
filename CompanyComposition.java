import java.util.ArrayList;

class Employee {
    String name;
    String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void displayEmployee() {
        System.out.println("Employee: " + name + ", Position: " + position);
    }
}

class Department {
    String name;
    ArrayList<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayDepartment() {
        System.out.println("Department: " + name);
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }
}

class Company {
    String name;
    ArrayList<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayCompany() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.displayDepartment();
        }
    }
}

public class CompanyComposition {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        Department dept1 = new Department("IT");
        Department dept2 = new Department("HR");

        dept1.addEmployee(new Employee("Alice", "Developer"));
        dept1.addEmployee(new Employee("Bob", "Tester"));

        dept2.addEmployee(new Employee("Charlie", "HR Manager"));

        company.addDepartment(dept1);
        company.addDepartment(dept2);

        company.displayCompany();
    }
}
