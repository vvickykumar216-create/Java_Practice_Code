package Local_Variable;

import java.util.Scanner;

public class Test02_Product {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int product = a * b;
        System.out.println("Product is: " + product);
    }
}
