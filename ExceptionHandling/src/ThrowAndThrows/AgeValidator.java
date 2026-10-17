package ThrowAndThrows;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class AgeValidator {
    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("valid age");
    }

    static void main(String[] args) {
        try {
            validate(17);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}