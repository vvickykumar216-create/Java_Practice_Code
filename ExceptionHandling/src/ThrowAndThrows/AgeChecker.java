package ThrowAndThrows;

public class AgeChecker {
    static void checkAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        System.out.println("Valid age: "+age);
    }

    static void main(String[] args) {
        try {
            checkAge(-5);
        }catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}
