package Control_flow.level1;
import java.util.Scanner;

public class Lev1_Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }

}
