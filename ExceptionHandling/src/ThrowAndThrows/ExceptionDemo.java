package ThrowAndThrows;

import java.io.IOException;

public class ExceptionDemo {
    static void checkedException()throws IOException{
        throw new IOException("File not Found");
    }
    static void uncheckException() {
        throw new ArithmeticException("Cannot divide by zero");
    }

    static void main(String[] args) {
        try {
            checkedException();
        }catch (IOException e){
            System.out.println("Checked: "+ e.getMessage());
        }
        try {
            uncheckException();
        }catch (ArithmeticException e){
            System.out.println("Unchecked: "+ e.getMessage());
        }
    }
}
