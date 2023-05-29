//https://www.codewars.com/kata/5993fb6c4f5d9f770c0000f2/train/java

import java.util.Arrays;

public class SumListIgnoreDuplicates {

    public static void main(String[] args) {
        int[] array = {3, 4, 3, 6};
        int[] uniqueArray = Arrays.stream(array)
                .distinct()
                .filter(i -> countOccurences(array, i) == 1)
                .toArray();

        int sumOfUniqueInt = Arrays.stream(uniqueArray)
                .sum();
    }

    private static int countOccurences(int[] array, int element) {
        int count = 0;
        for (int num : array) {
            if (num == element) {
                count++;
            }
        }
        return count;
    }
}