package String.level2;

class Splitter {
    public static String[] manualSplit(String text) {
        int spaceCount = 0;
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == ' ') spaceCount++;

        String[] words = new String[spaceCount + 1];
        int start = 0, wordIndex = 0;

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(start, i);
                start = i + 1;
            }
        }

        return words;
    }

    public static void main(String[] args) {
        String text = "Java is powerful";
        String[] manual = manualSplit(text);
        String[] builtin = text.split(" ");

        System.out.println("Manual Split:");
        for (String word : manual) System.out.println(word);

        System.out.println("Match with built-in: " + java.util.Arrays.equals(manual, builtin));
    }
}