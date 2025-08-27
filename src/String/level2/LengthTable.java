package String.level2;

class LengthTable {
    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result;
    }

    public static void main(String[] args) {
        String text = "Java is fun";
        String[] words = text.split(" ");
        String[][] table = getWordLengths(words);

        System.out.println("Word\tLength");
        for (String[] row : table)
            System.out.println(row[0] + "\t" + row[1]);
    }
}