package Control_flow.Level3;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();
        double average = (physics + chemistry + maths) / 3.0;
        System.out.println("Average: " + average);
        if (average >= 90)
            System.out.println("Grade: A");
        else if (average >= 75)
            System.out.println("Grade: B");
        else if (average >= 60)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: D");
    }
}
