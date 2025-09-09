package programming_elements;
import java.util.Scanner;
public class distance {
    public static void main(String[] args) {
        System.out.println("Enter the distance");
        Scanner input = new Scanner(System.in);
        double distanceInFeet = input.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        System.out.println("The distance is " + distanceInYards + " yards or " + distanceInMiles + " miles.");
    }
}
