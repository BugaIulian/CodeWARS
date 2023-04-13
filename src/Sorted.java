public class Sorted {

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 13, 21};
        System.out.println(sortOrNot(sortedArray));
    }

    private static String sortOrNot(int[] sortedArray) {
        boolean ascending = true;
        boolean descending = true;
        for (int i = 1; i < sortedArray.length; i++) {
            if (sortedArray[i] > sortedArray[i - 1]) {
                descending = false;
            } else if (sortedArray[i] < sortedArray[i - 1]) {
                ascending = false;
            }
        }
        return ascending ? "yes, ascending" : descending ? "yes, descending" : "no";
    }
}