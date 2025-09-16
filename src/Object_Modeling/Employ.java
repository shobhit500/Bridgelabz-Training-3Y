package Object_Modeling;

import java.util.ArrayList;

class Employee {
    String name;
    String role;

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    void showEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Role: " + role);
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        employees = new ArrayList<>();
    }

    void addEmployee(String name, String role) {
        Employee e = new Employee(name, role);
        employees.add(e);
    }

    void showDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.showEmployee();
            System.out.println();
        }
    }
}

class Company {
    String companyName;
    ArrayList<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showDepartment();
            System.out.println("------------------");
        }
    }
}

public class Employ {
    public static void main(String[] args) {
        Company c1 = new Company("TechNova Pvt Ltd");

        Department dev = new Department("Development");
        dev.addEmployee("Shobhit", "Java Developer");
        dev.addEmployee("Riya", "Frontend Developer");

        Department hr = new Department("Human Resources");
        hr.addEmployee("Amit", "HR Manager");

        c1.addDepartment(dev);
        c1.addDepartment(hr);

        c1.showCompany();

        // Simulating deletion
        c1 = null;
        System.gc(); // Suggests garbage collection
    }
}