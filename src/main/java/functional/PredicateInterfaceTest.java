package functional;

import java.util.function.Predicate;

public class PredicateInterfaceTest {
    public static void main(String[] args) {
        System.out.println("Is PhoneNumber Valid: " + isPhoneNumberValid("+6254564546121"));
        System.out.println("Is PhoneNumber Valid: " + isPhoneNumberValid("+94123456789"));
        System.out.println("Is PhoneNumber Valid: " + isPhoneNumberValid("+95123456789"));
        System.out.println("Is PhoneNumber Valid: " + isPhoneNumberValid("+11123456789"));
        System.out.println("Is PhoneNumber Valid With Predicate: " + isValidSriLankanPhoneNumberPredicate.test("+94123456799"));
        System.out.println("Is PhoneNumber Valid With Predicate: " + isValidSriLankanPhoneNumberPredicate.test("+94123456799"));
        System.out.println("Is PhoneNumber Valid With Predicate: " +
                isValidSriLankanPhoneNumberPredicate.and(isSriLankanPhoneNumberStartsWith777Predicate).test("+94777456789"));
        System.out.println("Is PhoneNumber Valid With Predicate - AND: " +
                isValidSriLankanPhoneNumberPredicate.and(isSriLankanPhoneNumberStartsWith777Predicate).test("+94776456789"));
        System.out.println("Is PhoneNumber Valid With Predicate - OR: " +
                isValidSriLankanPhoneNumberPredicate.or(isSriLankanPhoneNumberStartsWith777Predicate).test("+94776456789"));

    }

    // IMPERATIVE WAY
    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+94") && phoneNumber.length() == 12;
    }

    // DECLARATIVE WAY
    static Predicate<String> isValidSriLankanPhoneNumberPredicate = phoneNumber -> phoneNumber.startsWith("+94") && phoneNumber.length() == 12;
    static Predicate<String> isSriLankanPhoneNumberStartsWith777Predicate = phoneNumber -> phoneNumber.startsWith("+94777");

}
