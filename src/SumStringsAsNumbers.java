public class SumStringsAsNumbers {
    public static void main(String[] args) {
        String result = sumStrings("123", "456");
    }

    private static String sumStrings(String a, String b) {
        int sum = Integer.parseInt(a) + Integer.parseInt(b);
        return String.valueOf(sum);
    }
}
