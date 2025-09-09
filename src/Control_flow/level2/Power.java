package Control_flow.level2;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        if (number < 1 || power < 0) return;
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println("Result: " + result);
    }
}
//import java.util.Scanner;
//
//public class PowerWhile {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int power = sc.nextInt();
//        if (number < 1 || power < 0) return;
//        int result = 1;
//        int counter = 0;
//        while (counter < power) {
//            result *= number;
//            counter++;
//        }
//        System.out.println("Result: " + result);
//    }
//}

