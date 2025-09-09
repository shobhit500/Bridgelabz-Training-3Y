package String.level2;

class minmax {
    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result;
    }

    public static int[] findMinMax(String[][] wordTable) {
        int min = 0, max = 0;
        for (int i = 1; i < wordTable.length; i++) {
            int len = Integer.parseInt(wordTable[i][1]);
            if (len < Integer.parseInt(wordTable[min][1])) min = i;
            if (len > Integer.parseInt(wordTable[max][1])) max = i;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        String text = "Java is extremely powerful";
        String[] words = text.split(" ");
        String[][] table = getWordLengths(words);
        int[] result = findMinMax(table);

        System.out.println("Shortest: " + table[result[0]][0]);
        System.out.println("Longest: " + table[result[1]][0]);
    }
}