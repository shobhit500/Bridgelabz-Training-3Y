package keywords_instanceofopr.level1;

public class Student {
    static String universityName = "National University";
    static int totalStudents = 0;

    private final int rollNumber;
    private String name;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void handleStudent(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            System.out.println("Name: " + s.name);
            System.out.println("Roll Number: " + s.rollNumber);
            System.out.println("Grade: " + s.grade);
            System.out.println("University: " + universityName);
        } else {
            System.out.println("Invalid object");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Shobhit", 101, "A");
        Student s2 = new Student("Neha", 102, "B");

        s1.handleStudent(s1);
        s2.handleStudent("Not a student");

        displayTotalStudents();
    }
}