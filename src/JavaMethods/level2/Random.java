package JavaMethods.level2;

class Random {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = (int)(Math.random() * 9000) + 1000;
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        double avg = sum / (double) numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] nums = generate4DigitRandomArray(5);
        System.out.print("Generated Numbers: ");
        for (int n : nums) System.out.print(n + " ");
        System.out.println();

        double[] stats = findAverageMinMax(nums);
        System.out.printf("Average: %.2f, Min: %.0f, Max: %.0f%n", stats[0], stats[1], stats[2]);
    }
}