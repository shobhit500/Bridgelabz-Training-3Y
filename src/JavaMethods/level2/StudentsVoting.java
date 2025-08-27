package JavaMethods.level2;

import java.util.Scanner;

class StudentsVoting {
    public static boolean canStudentVote(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        for (int age : ages) {
            if (age < 0)
                System.out.println("Invalid age.");
            else if (canStudentVote(age))
                System.out.println("Age " + age + ": Can vote.");
            else
                System.out.println("Age " + age + ": Cannot vote.");
        }
    }
}