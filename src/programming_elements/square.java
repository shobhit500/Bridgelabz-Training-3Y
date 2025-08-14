package programming_elements;
import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        System.out.println("Enter the perimeter:");
        Scanner input = new Scanner(System.in);
        double perimeter = input.nextDouble();
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }


}
