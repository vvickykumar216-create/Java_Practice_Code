package ThrowAndThrows;

public class Demo {
    static void checkNumber(int num) throws ArithmeticException {
        if (num == 0){
            throw new ArithmeticException("Number cannot be zero");
        }
        System.out.println("Valid number");
    }

    static void main(String[] args) {
        try {
            checkNumber(0);
        }catch (ArithmeticException e) {
            System.out.println("Exception: "+ e.getMessage());
        }
    }
}
