package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        // 1. Sum - Identity value = 0
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);

        // 2. Maximum - Identity value = 0
        int max = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);

        // 3. Product - Identity value = 1
        int product = numbers.stream().reduce(1, (a, b) -> a * b);

        System.out.println("Sum = " + sum);
        System.out.println("Maximum = " + max);
        System.out.println("Product = " + product);

        // Optional wala reduce
        Optional<Integer> optionalSum = numbers.stream().reduce((a, b) -> a + b);

        System.out.println("Optional Sum = " + optionalSum.get());
    }
}