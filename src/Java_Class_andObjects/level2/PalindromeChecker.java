package Java_Class_andObjects.level2;
public class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public void displayResult() {
        System.out.println("Input Text: " + text);
        if (isPalindrome()) {
            System.out.println("Result: The text is a palindrome.");
        } else {
            System.out.println("Result: The text is not a palindrome.");
        }
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("Madam");
        PalindromeChecker checker2 = new PalindromeChecker("Hello");

        checker1.displayResult();
        checker2.displayResult();
    }
}