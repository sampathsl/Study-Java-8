package functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFuctionalInterfaceTest {
    public static void main(String[] args) {
        int numOne = 10;
        int numTwo = 10;

        // FUNCTION
        System.out.println("FUNCTION Increase Number & Multiply By: " + incrementByOneFunction.andThen(multiplyByTenFunction).apply(numOne));

        // BI FUNCTION
        System.out.println("BI FUNCTION Increase Number By One: " + integerIntegerIntegerBiFunction.apply(numOne, numTwo));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;

    static BiFunction<Integer, Integer, Integer> integerIntegerIntegerBiFunction = (numberToIncrementByOne, numberToMultiplyBy)
            -> (numberToIncrementByOne + 1) * numberToMultiplyBy;
}
