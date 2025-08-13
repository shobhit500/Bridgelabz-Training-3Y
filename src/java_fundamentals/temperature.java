package java_fundamentals;
import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display the result
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

    }
    }
