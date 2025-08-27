package String.level3;

class UniqueChar {
    public static char[] findUnique(String text) {
        int len = text.length();
        char[] unique = new char[len];
        int count = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) unique[count++] = ch;
        }

        char[] result = new char[count];
        System.arraycopy(unique, 0, result, 0, count);
        return result;
    }

    public static void main(String[] args) {
        String input = "programming";
        char[] unique = findUnique(input);
        System.out.print("Unique characters: ");
        for (char ch : unique) System.out.print(ch + " ");
    }
}