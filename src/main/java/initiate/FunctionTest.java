package initiate;

import util.GENDER;
import util.Person;

import java.util.ArrayList;
import java.util.List;

public class FunctionTest {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Sam", GENDER.MALE, "+94123456789"),
                new Person("Alex", GENDER.MALE, "+94123456789"),
                new Person("Jenny", GENDER.MALE, "+94123456789"),
                new Person("Alice", GENDER.FEMALE, "+94123456789"),
                new Person("Penny", GENDER.FEMALE, "+94123456789"),
                new Person("John", GENDER.MALE, "+94123456789"),
                new Person("Ann", GENDER.FEMALE, "+94123456789")
        );

        // IMPERATIVE WAY OF SEPARATING MALE, FEMALE
        List males = new ArrayList<Person>();
        List females = new ArrayList<Person>();
        for (Person person : people) {
            if (person.getGender().equals(GENDER.MALE)) {
                males.add(person);
            } else {
                females.add(person);
            }
        }

        System.out.println("IMPERATIVE WAY: Male Count: " + males.size());
        System.out.println("IMPERATIVE WAY: Female Count: " + females.size());

        // DECLARATIVE APPROACH
        System.out.println("DECLARATIVE WAY: Male Count: " + people.stream()
                .filter(person -> person.getGender()
                        .equals(GENDER.MALE)).count());
        System.out.println("DECLARATIVE WAY: FeMale Count: " + people.stream()
                .filter(person -> person.getGender()
                        .equals(GENDER.FEMALE)).count());

    }

}
