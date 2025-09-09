package Java_Constructors.level1;
public class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0);
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + Math.PI * radius * radius);
        System.out.println("Circumference: " + 2 * Math.PI * radius);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        Circle customCircle = new Circle(4.5);

        defaultCircle.displayDetails();
        customCircle.displayDetails();
    }
}
