package String.level3;

import java.util.Scanner;

class BMI {
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100;
            double bmi = weight / (heightM * heightM);
            String status = (bmi < 18.5) ? "Underweight" :
                    (bmi < 25) ? "Normal" :
                            (bmi < 30) ? "Overweight" : "Obese";

            result[i][0] = String.format("%.1f", weight);
            result[i][1] = String.format("%.1f", heightCm);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        String[][] bmiTable = calculateBMI(data);
        System.out.println("\nWeight\tHeight\tBMI\tStatus");
        for (String[] row : bmiTable)
            System.out.println(String.join("\t", row));
    }
}