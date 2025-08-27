package JavaMethods.level2;

import java.util.Scanner;

class SumComparison {
    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Must be a natural number.");
            return;
        }

        System.out.println("Recursive Sum: " + recursiveSum(n));
        System.out.println("Formula Sum: " + formulaSum(n));
    }
}