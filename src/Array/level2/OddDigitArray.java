package Array.level2;

import java.util.Scanner;

class OddDigitArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] oddDigits = new int[10];
        int index = 0;

        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                oddDigits[index++] = digit;
            }
            number /= 10;
        }

        System.out.println("Odd digits:");
        for (int i = 0; i < index; i++) {
            System.out.print(oddDigits[i] + " ");
        }

        input.close();
    }
}