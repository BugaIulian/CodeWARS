import java.util.Arrays;

public class FindUniqueNumber {

    public static void main(String[] args) {
        int[] array = {1, 1, 1, 6, 1, 1};
        System.out.println(findUnique(array));
    }

    private static double findUnique(int[] array) {
        return Arrays.stream(array)
                .distinct()
                .filter(n -> Arrays.stream(array).filter(x -> x == n).count() == 1)
                .findFirst()
                .orElse(-1);
    }
}