package Local_Variable;

import java.util.Scanner;

public class Test05_Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, temp;

        System.out.println("Enter first number");
        num1 = input.nextInt();

        System.out.println("Enter second number");
        num2 = input.nextInt();

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swaping");
        System.out.println("first number = " + num1);
        System.out.println("second number = " + num2);

        input.close();
    }
}
