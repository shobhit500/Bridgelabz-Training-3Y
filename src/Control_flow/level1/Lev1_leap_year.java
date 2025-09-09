package Control_flow.level1;
import java.util.*;
public class Lev1_leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        System.out.println("Using multiple if-else statements:");
        if (year < 1582) {
            System.out.println("Year is not valid for Gregorian calendar");
        } else if (year % 4 != 0) {
            System.out.println("Year is not a Leap Year");
        } else if (year % 100 != 0) {
            System.out.println("Year is a Leap Year");
        } else if (year % 400 == 0) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }

        System.out.println("Using single if statement with logical operators:");
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println("Year is a Leap Year");
        } else if (year < 1582) {
            System.out.println("Year is not valid for Gregorian calendar");
        } else {
            System.out.println("Year is not a Leap Year");
        }
    }
}
