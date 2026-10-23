package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameToUppercase {

    public static void main(String[] args) {

        List<String> name = Arrays.asList(
                "vicky",
                "Aman",
                "raja",
                "Akashy",
                "Akashy"
        );

        List<String> result = name.stream()
                .map(n -> n.toUpperCase())
                .filter(n -> n.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Name starting with A");
        System.out.println(result);
    }
}