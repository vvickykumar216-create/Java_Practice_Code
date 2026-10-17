package CustomException;

class ArithmeticAgeException extends Exception {
    ArithmeticAgeException(String message){
        super(message);
    }
}
public class AgeValidator {
    void Age(int age) throws ArithmeticAgeException {
        if (age < 18) {
            throw new ArithmeticAgeException("Invalid age! please enter valid age: "+ age);
        }
        System.out.println("Valid age");
    }
}
class Main01 {
    static void main(String[] args) {
        AgeValidator a = new AgeValidator();
        try {
            a.Age(12);
        }catch (ArithmeticAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}



