package JavaMethods.level3;

class Bonus {
    public static int[][] generateSalaryAndService(int count) {
        int[][] data = new int[count][2];
        for (int i = 0; i < count; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000; // Salary
            data[i][1] = (int)(Math.random() * 10) + 1;         // Years of service
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double bonusRate = data[i][1] > 5 ? 0.05 : 0.02;
            double bonus = data[i][0] * bonusRate;
            result[i][0] = data[i][0] + bonus; // New salary
            result[i][1] = bonus;
        }
        return result;
    }

    public static void displaySalaryTable(int[][] original, double[][] updated) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.println("Emp\tOldSalary\tService\tNewSalary\tBonus");
        for (int i = 0; i < original.length; i++) {
            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%.2f%n",
                    i + 1, original[i][0], original[i][1], updated[i][0], updated[i][1]);
            totalOld += original[i][0];
            totalNew += updated[i][0];
            totalBonus += updated[i][1];
        }
        System.out.printf("\nTotal Old Salary: %.2f\nTotal New Salary: %.2f\nTotal Bonus: %.2f%n",
                totalOld, totalNew, totalBonus);
    }

    public static void main(String[] args) {
        int[][] salaryData = generateSalaryAndService(10);
        double[][] updatedData = calculateBonusAndNewSalary(salaryData);
        displaySalaryTable(salaryData, updatedData);
    }
}