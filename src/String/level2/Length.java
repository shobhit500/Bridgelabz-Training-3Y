package String.level2;

class Length {
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        String input = "HelloWorld";
        System.out.println("Manual Length: " + getLength(input));
        System.out.println("Built-in Length: " + input.length());
    }
}