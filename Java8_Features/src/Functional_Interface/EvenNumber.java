package Functional_Interface;

// Predicate

import java.util.function.Predicate;

public class EvenNumber {

    public static void main(String[] args) {

        // Check whether number is even
        Predicate<Integer> isEven = n -> n % 2 == 0;

        // test()
        System.out.println("Is 10 even? " + isEven.test(10));
        System.out.println("Is 7 even? " + isEven.test(7));

        // negate()
        Predicate<Integer> isOdd = isEven.negate();
        System.out.println("Is 7 odd? " + isOdd.test(7));

        // Another condition: number is greater than 10
        Predicate<Integer> greaterThan10 = n -> n > 10;

        // and()
        Predicate<Integer> evenAndGreater10 = isEven.and(greaterThan10);
        System.out.println("Is 20 even AND greater than 10? " + evenAndGreater10.test(20)
        );

        // or()
        Predicate<Integer> evenOrGreaterThan10 = isEven.or(greaterThan10);
        System.out.println("Is 7 even OR greater than 10? " + evenOrGreaterThan10.test(7));
    }
}
