package Array.level1;

import java.util.Scanner;

public class StoreValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number: ");
            double num = input.nextDouble();

            if (num <= 0 || index == 10) break;

            values[index++] = num;
        }

        for (int i = 0; i < index; i++) {
            total += values[i];
        }

        System.out.println("Entered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(values[i] + " ");
        }

        System.out.println("\nSum of numbers: " + total);
        input.close();
    }
}