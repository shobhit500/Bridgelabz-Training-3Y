package JavaMethods.level3;

class Football {
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++)
            heights[i] = (int)(Math.random() * 101) + 150; // 150–250 cm
        return heights;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int val : arr) total += val;
        return total;
    }

    public static double mean(int[] arr) {
        return sum(arr) / (double) arr.length;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int val : arr) if (val < min) min = val;
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int val : arr) if (val > max) max = val;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        System.out.print("Heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println("\nShortest: " + min(heights));
        System.out.println("Tallest: " + max(heights));
        System.out.printf("Mean Height: %.2f cm%n", mean(heights));
    }
}