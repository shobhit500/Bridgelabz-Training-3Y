package String.level1;
import java.util.Scanner;

public class ManualUppercase {
    public static String convertToUpper(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is lowercase alphabet
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase by subtracting 32 from ASCII value
                result += (char)(ch - 32);
            } else {
                // Leave other characters unchanged
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = input.nextLine();

        String upper = convertToUpper(original);
        System.out.println("Converted to uppercase: " + upper);

        input.close();
    }
}