package Inheritance;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        showBasicInfo();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        showBasicInfo();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        showBasicInfo();
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

public class School_System {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Shobhit", 35, "Mathematics");
        Student s1 = new Student("Riya", 16, "10th Grade");
        Staff st1 = new Staff("Amit", 40, "Administration");

        t1.displayRole();
        System.out.println();
        s1.displayRole();
        System.out.println();
        st1.displayRole();
    }
}