//https://www.codewars.com/kata/51c8991dee245d7ddf00000e/train/java

import java.util.ArrayList;
import java.util.List;

public class ReversedWords {
    public static void main(String[] args) {
        System.out.println(reversedWords("Here is an example!"));
    }

    private static String reversedWords(String str) {
        String[] addedWords = str.split("\\s+");
        List<String> stringList = new ArrayList<String>();
        for (int i = addedWords.length - 1; i >= 0; i--) {
            stringList.add(addedWords[i]);
        }
        StringBuilder result = new StringBuilder();
        for (String word : stringList) {
            result.append(word).append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }

}
