public class MinMaxCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java MinMaxCalculator <num1> <num2> <num3>");
            return;
        }

        // Parse command-line arguments as integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        int min = Math.min(Math.min(num1, num2), num3);
        int max = Math.max(Math.max(num1, num2), num3);

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
