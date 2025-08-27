package JavaMethods.level2;

import java.util.Scanner;

class Number {
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a == b) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        for (int num : nums) {
            if (isPositive(num)) {
                System.out.println(num + " is Positive and " + (isEven(num) ? "Even" : "Odd"));
            } else {
                System.out.println(num + " is Negative");
            }
        }

        int result = compare(nums[0], nums[4]);
        System.out.print("Comparison of first and last: ");
        if (result == 1) System.out.println("First is greater");
        else if (result == 0) System.out.println("Both are equal");
        else System.out.println("Last is greater");
    }
}