package Control_flow.level2;
import java.util.*;
public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }
        int factorial = 1;
        int i = 1;
        while (i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }


}
