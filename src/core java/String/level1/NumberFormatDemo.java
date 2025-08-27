package String.level1;

import java.util.Scanner;

class NumberFormatDemo {
    public static void generateException(String text) {
        int num = Integer.parseInt(text); // Will fail if not numeric
        System.out.println("Parsed number: " + num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        // generateException(text); // Uncomment to see crash
        handleException(text);
        sc.close();
    }
}