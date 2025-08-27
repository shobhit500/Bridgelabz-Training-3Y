package JavaMethods.level2;

import java.util.Scanner;

class BMI {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3]; // weight, height, BMI

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
        }

        System.out.println("\nBMI Results:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d - Weight: %.1f kg, Height: %.1f cm, BMI: %.2f, Status: %s%n",
                    i + 1, data[i][0], data[i][1], data[i][2], getBMIStatus(data[i][2]));
        }
    }
}