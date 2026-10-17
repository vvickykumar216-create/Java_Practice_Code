package Try_Catch_Finally;

public class Nested {
    static void main(String[] args) {
        try {
            System.out.println("Outer try started");
            try {
                System.out.println("Inner try stared");
                int result = 10 / 0;
                System.out.println("Result: "+result);
            }catch (ArithmeticException e){
                System.out.println("Inner catch: Cannot divide by zero");
            }
            int[] marks = {10, 20, 30};
            System.out.println(marks[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Outer catch: invalid array index");
        }
        System.out.println("Program continues...");
    }
}
