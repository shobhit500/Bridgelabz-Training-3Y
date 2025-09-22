package oop_concepts;
import java.util.ArrayList;

interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: ₹" + baseSalary);
        System.out.println("Final Salary: ₹" + calculateSalary());
    }
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    public void assignDepartment(String deptName) {
        department = deptName;
    }

    public String getDepartmentDetails() {
        return department;
    }

    double calculateSalary() {
        return getBaseSalary();
    }
}

class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double hourlyRate;

    PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public void assignDepartment(String deptName) {
        department = deptName;
    }

    public String getDepartmentDetails() {
        return department;
    }

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

class emp_manag {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        FullTimeEmployee e1 = new FullTimeEmployee(101, "Shobhit", 50000);
        e1.assignDepartment("Development");

        PartTimeEmployee e2 = new PartTimeEmployee(102, "Riya", 0, 80, 500);
        e2.assignDepartment("Support");

        employees.add(e1);
        employees.add(e2);

        for (Employee emp : employees) {
            emp.displayDetails();
            if (emp instanceof Department) {
                System.out.println("Department: " + ((Department) emp).getDepartmentDetails());
            }
            System.out.println("------");
        }
    }
}