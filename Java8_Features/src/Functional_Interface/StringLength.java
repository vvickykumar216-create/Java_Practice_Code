package Functional_Interface;

// Function

import java.util.function.Function;

public class StringLength {
    public static void main(String[] args) {

        // Function 1: String ki length
        Function<String, Integer> length = str -> str.length();

        // Function 2: Integer ko double karna
        Function<Integer, Integer> doubleValue = n -> n * 2;

        // and Then()
        Function<String, Integer> andThenFunction = length.andThen(doubleValue);
        System.out.println("and Then result = " + andThenFunction.apply("Vicky"));

        // compose()
        Function<String, Integer> composeFunction = doubleValue.compose(length);
        System.out.println("compose result = " + composeFunction.apply("Vicky"));
    }
}
