package Control_flow.Level3;

import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int original = number;
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        System.out.println(sum == original ? "Armstrong Number" : "Not an Armstrong Number");
    }
}