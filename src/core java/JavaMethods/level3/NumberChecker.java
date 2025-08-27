package JavaMethods.level3;

import java.util.Scanner;

public class NumberChecker {

    // Method to calculate sum of proper divisors
    public static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum;
    }

    // Check if number is perfect
    public static boolean isPerfect(int num) {
        return sumOfDivisors(num) == num;
    }

    // Check if number is abundant
    public static boolean isAbundant(int num) {
        return sumOfDivisors(num) > num;
    }

    // Check if number is deficient
    public static boolean isDeficient(int num) {
        return sumOfDivisors(num) < num;
    }

    // Method to calculate factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    // Check if number is strong
    public static boolean isStrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = sc.nextInt();

        System.out.println("\n--- Number Classification ---");
        System.out.println("Perfect Number: " + isPerfect(num));
        System.out.println("Abundant Number: " + isAbundant(num));
        System.out.println("Deficient Number: " + isDeficient(num));
        System.out.println("Strong Number: " + isStrong(num));
    }
}