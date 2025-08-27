package String.level1;

import java.util.Scanner;

class occurence {
    public static int[] findAllIndexes(String text, char ch) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) count++;
        }

        int[] indexes = new int[count];
        int j = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) indexes[j++] = i;
        }

        return indexes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        System.out.print("Enter a character to find: ");
        char ch = sc.next().charAt(0);

        int[] result = findAllIndexes(text, ch);
        System.out.println("Indexes of '" + ch + "':");
        for (int index : result) {
            System.out.print(index + " ");
        }
        sc.close();
    }
}