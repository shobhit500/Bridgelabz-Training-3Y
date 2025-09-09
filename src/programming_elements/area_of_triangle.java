package programming_elements;
import java.util.Scanner;
public class area_of_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of the triangle in cm: ");
        double baseCm = input.nextDouble();

        System.out.print("Enter height of the triangle in cm: ");
        double heightCm = input.nextDouble();


        double areaCm2 = 0.5 * baseCm * heightCm;

        double baseInches = baseCm / 2.54;
        double heightInches = heightCm / 2.54;

        double areaInches2 = 0.5 * baseInches * heightInches;
        System.out.println("Your base in cm is " + baseCm + " and height in cm is " + heightCm);
        System.out.println("Area of the triangle is " + areaCm2 + " square cm and " + areaInches2 + " sq inches");
    }

}
