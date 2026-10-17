package Catch.with.multiresource;

import java.util.Scanner;

public class Calculator {
    static void calculate(String input, int b) {
        try {
            int a = Integer.parseInt(input);
            int result = a / b;
            System.out.println("Result = "+result);
        }catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Exception occurred: "+e.getMessage());
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        String input = sc.nextLine();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        calculate(input, b);
    }
}
