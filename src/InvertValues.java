//https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad/train/java
public class InvertValues {
    public static void main(String[] args) {
        int[] arrayTest = {1, 2, -3, -10, 21};
        invertArray(arrayTest);
    }

    private static int[] invertArray(int[] arrayTest) {
        for (int i = 0; i < arrayTest.length; i++) {
            arrayTest[i] *= -1;
        }

        return arrayTest;
    }
}