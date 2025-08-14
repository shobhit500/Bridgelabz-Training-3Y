package programming_elements;
import java.util.Scanner;
public class dist_kmtomiles {
    public static void main(String[] args) {
        double km;
        System.out.println("Enter the distance in km");
        Scanner input = new Scanner(System.in);
        km = input.nextInt();
        double miles = km / 1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }

}
