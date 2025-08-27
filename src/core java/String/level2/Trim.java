package String.level2;

class Trim {
    public static String trimSpaces(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;
        String trimmed = "";
        for (int i = start; i <= end; i++) trimmed += text.charAt(i);
        return trimmed;
    }

    public static void main(String[] args) {
        String input = "   Hello World!   ";
        String manual = trimSpaces(input);
        String builtin = input.trim();
        System.out.println("Manual: [" + manual + "]");
        System.out.println("Built-in: [" + builtin + "]");
        System.out.println("Match: " + manual.equals(builtin));
    }
}