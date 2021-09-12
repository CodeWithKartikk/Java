public class Recursion {
    public static void main(String[] args) {
        // Recursion is the technique of making a function call itself.
        // This technique provides a way to break the big problems into fragments of
        // small problems, which are easier to solve.
        // Recursion may be difficult to understand.The best way to figure out how it
        // works is to experiment with.

        int result = sum(10);
        System.out.println(result);

        int result1 = sum(5, 10);
        System.out.println(result1);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}