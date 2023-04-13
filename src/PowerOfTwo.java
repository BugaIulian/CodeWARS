public class PowerOfTwo {

    public static void main(String[] args) {
        isPowerOfTwo(64);
    }

    private static boolean isPowerOfTwo(long n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}