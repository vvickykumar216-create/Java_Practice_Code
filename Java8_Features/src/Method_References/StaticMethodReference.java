package Method_References;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StaticMethodReference {
    static void main(String[] args) {
        // 1. String to Integer
        List<String> numbers = Arrays.asList("10", "20", "30", "40");
        List<Integer> result1 = numbers.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(result1);


        // 2. Negative to Positive
        List<Integer> negativeNumbers = Arrays.asList(-10, -20, 30, -40);
        List<Integer> result2 = negativeNumbers.stream()
                .map(Math::abs)
                .collect(Collectors.toList());
        System.out.println(result2);
    }
}
