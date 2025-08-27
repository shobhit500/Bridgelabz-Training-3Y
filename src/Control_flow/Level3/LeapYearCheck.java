package Control_flow.Level3;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year < 1582) {
            System.out.println("Invalid year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap Year");
        } else if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
//Leap Year Check (Single if with logical operators)
//
//public class LeapYearLogical {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();
//        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
//            System.out.println("Leap Year");
//        } else {
//            System.out.println("Not a Leap Year");
//        }
//    }
//}