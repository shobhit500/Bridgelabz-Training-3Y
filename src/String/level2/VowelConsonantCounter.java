package String.level2;

class VowelConsonantCounter {
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return "aeiou".indexOf(ch) != -1;
    }

    public static int[] countVC(String text) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) vowels++;
                else consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        String input = "Hello World!";
        int[] vc = countVC(input);
        System.out.println("Vowels: " + vc[0] + ", Consonants: " + vc[1]);
    }
}