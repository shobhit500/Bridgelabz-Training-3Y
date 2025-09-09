package Array.level2;

import java.util.Scanner;

class EvenDigitArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] evenDigits = new int[10];
        int index = 0;

        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenDigits[index++] = digit;
            }
            number /= 10;
        }

        System.out.println("Even digits:");
        for (int i = 0; i < index; i++) {
            System.out.print(evenDigits[i] + " ");
        }

        input.close();
    }
}