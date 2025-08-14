package programming_elements;
import java.util.Scanner;
public class Handshake {
    public static void main(String[] args) {
        System.out.println("Enter number of Students:");
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("The maximum number of possible handshakes is " + maxHandshakes);
    }
}
