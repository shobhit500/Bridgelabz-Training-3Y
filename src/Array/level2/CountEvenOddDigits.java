package Array.level2;

import java.util.Scanner;

public class CountEvenOddDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int evenCount = 0, oddCount = 0;

        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            number /= 10;
        }

        System.out.println("Even digits count: " + evenCount);
        System.out.println("Odd digits count: " + oddCount);

        input.close();
    }
}