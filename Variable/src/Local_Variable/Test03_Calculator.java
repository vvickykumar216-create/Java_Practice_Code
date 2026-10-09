package Local_Variable;
import java.util.Scanner;
public class Test03_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Local variables
        int a, b;
        int addition, subtraction, multiplication;
        double division;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        // Calculations
        addition = a + b;
        subtraction = a - b;
        multiplication = a * b;
        division = (double) a / b;

        // Display results
        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);

        sc.close();
    }
}
