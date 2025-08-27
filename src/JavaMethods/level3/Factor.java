package JavaMethods.level3;

import java.util.Scanner;

class Factor{
    public static int[] getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0) factors[index++] = i;

        return factors;
    }

    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors)
            if (f > max) max = f;
        return max;
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

    public static double cubeProduct(int[] arr) {
        double prod = 1;
        for (int val : arr) prod *= Math.pow(val, 3);
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nGreatest Factor: " + greatestFactor(factors));
        System.out.println("Sum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Cube Product: " + cubeProduct(factors));
    }
}