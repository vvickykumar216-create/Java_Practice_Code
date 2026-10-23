package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product {

    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ExpensiveProducts {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Pen", 50),
                new Product("Keyboard", 1500),
                new Product("Mouse", 800),
                new Product("Laptop", 55000),
                new Product("Headphone", 2500),
                new Product("Monitor", 12000),
                new Product("Bag", 1200),
                new Product("Mobile", 25000),
                new Product("USB Cable", 300),
                new Product("Smart Watch", 5000)
        );

        List<String> expensiveProducts = products.stream()
                        .filter(p -> p.price > 1000)
                        .map(p -> p.name)
                        .collect(Collectors.toList());

        System.out.println("Products above ₹1000:");
        System.out.println(expensiveProducts);
    }
}