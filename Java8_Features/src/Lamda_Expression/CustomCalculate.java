package Lamda_Expression;

@FunctionalInterface
interface Calculate {
    int operator(int a, int b);
}

public class CustomCalculate {
    static void main(String[] args) {
        Calculate add = (a, b) -> a + b;
        Calculate subtract = (a, b) -> a - b;
        Calculate multiply = (a, b) -> a * b;

        int a = 10;
        int b = 5;

        System.out.println("Addition = " + add.operator(a,b));
        System.out.println("Subtraction = " + subtract.operator(a,b));
        System.out.println("Multiplication = " + multiply.operator(a,b));
    }
}
