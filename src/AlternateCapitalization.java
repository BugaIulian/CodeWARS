//https://www.codewars.com/kata/59cfc000aeb2844d16000075/train/java

public class AlternateCapitalization {

    public static void main(String[] args) {

        String[] expectedOutput = capitalize("abcde");

    }

    public static String[] capitalize(String s) {
        StringBuilder outPut1 = new StringBuilder(s.length());
        StringBuilder outPut2 = new StringBuilder(s.length());

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i % 2 == 0) {
                outPut2.append(Character.toLowerCase(c));
                outPut1.append(Character.toUpperCase(c));
            } else {
                outPut2.append(Character.toUpperCase(c));
                outPut1.append(Character.toLowerCase(c));
            }
        }

        return new String[]{outPut1.toString(), outPut2.toString()};
    }
}