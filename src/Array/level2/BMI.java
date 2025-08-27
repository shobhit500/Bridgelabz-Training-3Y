package Array.level2;

import java.util.Scanner;

class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = input.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter weight (kg) and height (m) for person " + (i + 1) + ":");
            weight[i] = input.nextDouble();
            height[i] = input.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 25) status[i] = "Normal";
            else if (bmi[i] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("\nBMI Report:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d: Height=%.2f, Weight=%.2f, BMI=%.2f, Status=%s%n",
                    i + 1, height[i], weight[i], bmi[i], status[i]);
        }

        input.close();
    }
}