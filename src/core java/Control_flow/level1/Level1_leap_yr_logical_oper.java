package Control_flow.level1;
import java.util.*;
public class Level1_leap_yr_logical_oper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println("Year is a Leap Year");
        } else if (year < 1582) {
            System.out.println("Year is not valid for Gregorian calendar");
        } else {
            System.out.println("Year is not a Leap Year");
        }
    }

}
