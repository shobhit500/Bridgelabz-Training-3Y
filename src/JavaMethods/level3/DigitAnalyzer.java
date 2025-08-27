package JavaMethods.level3;

import java.util.Scanner;

public class DigitAnalyzer {

    // Program 2: Count digits, extract digits, reverse digits
    public static int countDigits(int num) {
        return String.valueOf(Math.abs(num)).length();
    }

    public static int[] extractDigits(int num) {
        String s = String.valueOf(Math.abs(num));
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++)
            reversed[i] = digits[digits.length - 1 - i];
        return reversed;
    }

    public static void printArray(int[] arr) {
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }

    // Program 3: Duck, Armstrong, Harshad, Palindrome
    public static boolean isDuck(int[] digits) {
        for (int i = 1; i < digits.length; i++)
            if (digits[i] == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int[] digits, int num) {
        int sum = 0;
        for (int d : digits)
            sum += Math.pow(d, digits.length);
        return sum == num;
    }

    public static boolean isHarshad(int[] digits, int num) {
        int sum = 0;
        for (int d : digits) sum += d;
        return num % sum == 0;
    }

    public static boolean isPalindrome(int[] digits) {
        for (int i = 0; i < digits.length / 2; i++)
            if (digits[i] != digits[digits.length - 1 - i]) return false;
        return true;
    }

    // Program 4: Compare original and reversed digits
    public static boolean areArraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Program 2
        int count = countDigits(num);
        int[] digits = extractDigits(num);
        int[] reversed = reverseDigits(digits);

        System.out.println("\n--- Program 2 ---");
        System.out.println("Total Digits: " + count);
        System.out.print("Digits: ");
        printArray(digits);
        System.out.print("Reversed Digits: ");
        printArray(reversed);

        // Program 3
        System.out.println("\n--- Program 3 ---");
        System.out.println("Duck Number: " + isDuck(digits));
        System.out.println("Armstrong Number: " + isArmstrong(digits, num));
        System.out.println("Harshad Number: " + isHarshad(digits, num));
        System.out.println("Palindrome: " + isPalindrome(digits));

        // Program 4
        System.out.println("\n--- Program 4 ---");
        System.out.println("Original and Reversed Arrays Equal: " + areArraysEqual(digits, reversed));
    }
}