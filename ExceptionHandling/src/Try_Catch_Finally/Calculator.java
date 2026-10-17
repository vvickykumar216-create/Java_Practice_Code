package Try_Catch_Finally;

public class Calculator {
    static int divide(int a, int b) {
        return a / b;
    }

    static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: "+ result);
        }catch (ArithmeticException e ) {
            System.out.println("Exception: Cannot divide by zero");
        }finally {
            System.out.println("Operation complete");
        }
    }
}
