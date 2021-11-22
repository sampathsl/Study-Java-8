package functional;

import java.util.function.Function;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        int num = 10;
        System.out.printf("Increase Number By One: " + incrementByOneFunction.apply(num));
    }

// IMPERATIVE WAY
//    static int incrementByOne(int number) {
//        return number + 1;
//    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

}
