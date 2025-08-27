package Array.level1;

import java.util.Scanner;

class Classification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int num : numbers) {
            if (num > 0) {
                String type = (num % 2 == 0) ? "even" : "odd";
                System.out.println(num + " is positive and " + type);
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println(num + " is zero");
            }
        }

        if (numbers[0] == numbers[4]) {
            System.out.println("First and last elements are equal.");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First element is greater than last.");
        } else {
            System.out.println("First element is less than last.");
        }

        input.close();
    }
}