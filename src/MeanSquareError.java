//https://www.codewars.com/kata/51edd51599a189fe7f000015/train/java

public class MeanSquareError {

    public static void main(String[] args) {
        int[] a1 = {10, 10};
        int[] a2 = {10, 10};
        System.out.println(solution(a1, a2));
    }

    private static double solution(int[] arr1, int[] arr2) {
        double sum = 0;
        for (int index = 0; index < arr1.length; index++) {
            sum += Math.pow((arr1[index] - arr2[index]) * -1, 2);

        }
        return sum / arr1.length;
    }
}