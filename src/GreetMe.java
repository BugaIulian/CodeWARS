//https://www.codewars.com/kata/535474308bb336c9980006f2/train/java
public class GreetMe {

    public static void main(String[] args) {
        System.out.println(greet("riley"));
    }

    private static String greet(String name) {
        StringBuilder buildSentence = new StringBuilder();
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        buildSentence.append("Hello " + name + "!");
        return buildSentence.toString();
    }
}