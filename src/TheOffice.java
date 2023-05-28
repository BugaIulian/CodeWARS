//https://www.codewars.com/kata/57ecf6efc7fe13eb070000e1/train/java
public class TheOffice {

    public static void main(String[] args) {

        Person first = new Person("John", 1);
        Person second = new Person("Marie", 1);
        Person third = new Person("Julia", 1);
        Person[] array = new Person[3];
        array[0] = first;
        array[1] = second;
        array[2] = third;
        System.out.println(outed(array, "john"));
    }

    public static String outed(Person[] meet, String boss) {

        int happinessSum = 0;
        for (Person person : meet) {
            happinessSum += person.happiness;
            if (person.name.equalsIgnoreCase(boss)) {
                happinessSum += (person.happiness * 2);
            }
        }
        return (happinessSum / meet.length) <= 5 ? "Get Out Now!" : "Nice work Champ!";
    }
}
