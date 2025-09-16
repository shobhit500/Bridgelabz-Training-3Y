package Object_Modeling;

import java.util.ArrayList;

class Course {
    String courseName;
    ArrayList<Student> enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        enrolledStudents = new ArrayList<>();
    }

    void addStudent(Student s) {
        enrolledStudents.add(s);
    }

    void showCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Enrolled Students:");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> myCourses;

    Student(String name) {
        this.name = name;
        myCourses = new ArrayList<>();
    }

    void enroll(Course c) {
        myCourses.add(c);
        c.addStudent(this); // association both ways
    }

    void showCourses() {
        System.out.println("Student: " + name);
        System.out.println("Enrolled Courses:");
        for (Course c : myCourses) {
            System.out.println("- " + c.courseName);
        }
    }
}

class School {
    String schoolName;
    ArrayList<Student> students;

    School(String schoolName) {
        this.schoolName = schoolName;
        students = new ArrayList<>();
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showSchoolInfo() {
        System.out.println("School: " + schoolName);
        System.out.println("Students:");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

public class School_Students {
    public static void main(String[] args) {
        School school = new School("Green Valley School");

        Student s1 = new Student("Shobhit");
        Student s2 = new Student("Riya");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        // Aggregation: students added to school
        school.addStudent(s1);
        school.addStudent(s2);

        // Association: students enroll in courses
        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);

        // Display info
        school.showSchoolInfo();
        System.out.println();
        s1.showCourses();
        System.out.println();
        s2.showCourses();
        System.out.println();
        c1.showCourseInfo();
        System.out.println();
        c2.showCourseInfo();
    }
}