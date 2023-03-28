//https://www.codewars.com/kata/525c1a07bb6dda6944000031/train/java
public class KataExampleTwist {
    public static void main(String[] args) {
        System.out.println(kataExampleTwist());
    }

    private static String[] kataExampleTwist() {
        String[] webSites = new String[1000];
        for (int i = 0; i <= 999; i++) {
            webSites[i] = "codewars";
        }
        return webSites;
    }
}
