package Java_Class_andObjects.level1;

class Circle {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void showArea() {
        System.out.printf("Area of circle: %.4f", Math.PI * radius * radius);
    }

    public void showCircumference() {
        System.out.printf("\nCircumference of circle: %.4f", 2 * Math.PI * radius);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.75);

        circle.showArea();
        circle.showCircumference();
    }
}
