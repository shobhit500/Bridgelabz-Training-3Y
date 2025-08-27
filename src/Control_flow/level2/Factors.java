package Control_flow.level2;

import java.util.Scanner;

public class Factors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 1) return;
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                System.out.println(i);
        }
    }
}

//import java.util.Scanner;
//
//public class FactorsWhile {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        if (number < 1) return;
//        int i = 1;
//        while (i < number) {
//            if (number % i == 0)
//                System.out.println(i);
//            i++;
//        }
//    }
//}

