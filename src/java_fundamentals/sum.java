package java_fundamentals;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt user for second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate and display the sum
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }

}
