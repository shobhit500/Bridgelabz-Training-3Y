package Java_Class_andObjects.level2;

public class Student {
    String name;
    String rollNumber;
    double[] marks;

    Student(String name, String rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade() {
        double average = calculateAverage();
        if (average >= 80 && average <= 100) {
            return "Grade A";
        } else if (average >= 60) {
            return "Grade B";
        } else if (average >= 50) {
            return "Grade C";
        } else if (average >= 40) {
            return "Grade D";
        } else {
            return "Grade F";
        }
    }

    public double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Grade: " + calculateGrade());
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        double[] marks1 = {85, 78, 92};
        double[] marks2 = {55, 60, 58};

        Student student1 = new Student("Aarav", "ME001", marks1);
        Student student2 = new Student("Ishita", "IT002", marks2);

        student1.displayDetails();
        student2.displayDetails();
    }
}