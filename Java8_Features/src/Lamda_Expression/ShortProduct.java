package Lamda_Expression;

import java.util.*;

/** Expression Body Lambda

public class ShortProduct {
    public static void main(String[] args) {

        List<String> products = Arrays.asList(
                "Laptop",
                "Mobile",
                "Pen",
                "Headphone",
                "TV"
        );

        products.sort((p1, p2) -> p1.length() - p2.length());

        System.out.println(products);
    }
}
 */

//Block body lambda

import java.util.*;

public class ShortProduct {
    public static void main(String[] args) {

        List<String> products = Arrays.asList(
                "Laptop",
                "Mobile",
                "Pen",
                "Headphone",
                "TV"
        );

        products.sort((p1, p2) -> {return p1.length() - p2.length();});
        System.out.println(products);
    }
}