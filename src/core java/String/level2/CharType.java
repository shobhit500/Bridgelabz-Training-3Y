package String.level2;

class CharType {
    public static String getType(char ch) {
        ch = Character.toLowerCase(ch);
        if (!Character.isLetter(ch)) return "Not a Letter";
        return "aeiou".indexOf(ch) != -1 ? "Vowel" : "Consonant";
    }

    public static void main(String[] args) {
        String input = "Copilot123!";
        System.out.println("Char\tType");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            System.out.println(ch + "\t" + getType(ch));
        }
    }
}