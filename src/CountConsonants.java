//https://www.codewars.com/kata/564e7fc20f0b53eb02000106/train/java

public class CountConsonants {

    public static void main(String[] args) {
        int consonantsCount = getCount("hello world");
    }

    private static int getCount(String str) {


       long count = str.chars().mapToObj(c -> (char) c)
                .filter(c -> Character.isLetter(c) && !"aeiouAEIOU".contains(String.valueOf(c)))
                .count();

        return (int)count;
    }
}