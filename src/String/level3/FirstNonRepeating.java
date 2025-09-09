package String.level3;

class FirstNonRepeating {
    public static char findFirstUnique(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        for (int i = 0; i < text.length(); i++)
            if (freq[text.charAt(i)] == 1)
                return text.charAt(i);

        return '\0'; // No unique character
    }

    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstUnique(input);
        System.out.println("First non-repeating character: " + result);
    }
}