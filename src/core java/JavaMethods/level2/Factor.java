package JavaMethods.level2;

import java.util.Scanner;

class Factor{
    public static int[] getFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++)
            if (number % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++)
            if (number % i == 0) factors[index++] = i;

        return factors;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int val : arr) total += val;
        return total;
    }

    public static int product(int[] arr) {
        int prod = 1;
        for (int val : arr) prod *= val;
        return prod;
    }

    public static int sumOfSquares(int[] arr) {
        int total = 0;
        for (int val : arr) total += Math.pow(val, 2);
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");

        System.out.println("\nSum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Sum of Squares: " + sumOfSquares(factors));
    }
}