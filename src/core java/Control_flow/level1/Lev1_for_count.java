package Control_flow.level1;
import java.util.Scanner;

public class Lev1_for_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
