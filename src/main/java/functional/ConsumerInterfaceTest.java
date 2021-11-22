package functional;

import util.GENDER;
import util.Person;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerInterfaceTest {
    public static void main(String[] args) {
        Person personOne = new Person("Ann", GENDER.FEMALE, "+94123456789");
        Person personTwo = new Person("John", GENDER.MALE, "+94123456789");
        Person personThree = new Person("Maria", GENDER.FEMALE, "+94123456789");

        // IMPERATIVE WAY
        greetPerson(personOne);

        // DECLARATIVE WAY
        greetCustomerConsumerV1.accept(personTwo);
        greetCustomerConsumerV2.accept(personTwo, false);
        greetCustomerConsumerV2.accept(personThree, true);
    }

    static Consumer<Person> greetCustomerConsumerV1 = person -> System.out.println("Hello " + person.getName() + ", thanks for registering for this shop!");
    static BiConsumer<Person, Boolean> greetCustomerConsumerV2 = (person, showNumber) ->
            System.out.println("Hello " + person.getName() + ", thanks for registering for this shop! Your phone number is: " + (showNumber ? person.getPhoneNumber() : "**********"));

    static void greetPerson(Person person) {
        System.out.println("Hello " + person.getName() + ", thanks for coming to the shop!");
    }
}
