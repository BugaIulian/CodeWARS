//https://www.codewars.com/kata/57eb8fcdf670e99d9b000272/train/java

public class HighestScoringWord {
    public static void main(String[] args) {
        String highestScoringWord = high("man i need a taxi up to ubud");
    }

    private static String high(String s) {

        String[] wordList = s.split(" ");
        String highestScoringWord = "";
        int highestScore = 0;
        for (int i = 0; i < wordList.length; i++) {
            int wordScore = 0;
            for (int j = 0; j < wordList[i].length(); j++) {
                wordScore += wordList[i].charAt(j) - 'a' + 1;
            }
            if (wordScore > highestScore) {
                highestScore = wordScore;
                highestScoringWord = wordList[i];
            }
        }
        return highestScoringWord;
    }
}