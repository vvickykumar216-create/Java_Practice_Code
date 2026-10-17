package CustomException;

class MyException extends Exception {

    int errorCode;

    // Constructor 1: Only message
    MyException(String message) {
        super(message);
    }

    // Constructor 2: Message + error code
    MyException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}

public class ExceptionDemo {

    // Method 1: Constructor with only message
    static void checkAge(int age) throws MyException {

        if (age < 18) {
            throw new MyException(
                    "Age is less than 18"
            );
        }

        System.out.println("Valid Age");
    }

    // Method 2: Constructor with message + error code
    static void checkBalance(double balance) throws MyException {

        if (balance < 1000) {
            throw new MyException(
                    "Insufficient Balance", 101
            );
        }

        System.out.println("Sufficient Balance");
    }

    public static void main(String[] args) {

        // Constructor 1
        try {
            checkAge(15);
        }
        catch (MyException e) {
            System.out.println("Message: " + e.getMessage());
        }

        // Constructor 2
        try {
            checkBalance(500);
        }
        catch (MyException e) {
            System.out.println("Message: " + e.getMessage());
            System.out.println("Error Code: " + e.errorCode);
        }
    }
}
