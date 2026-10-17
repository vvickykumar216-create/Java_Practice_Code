package CustomException;

class InvalidPasswordException extends Exception {
    InvalidPasswordException(String message){
        super(message);
    }
}
public class LoginSystem {
    void login(String password) throws InvalidPasswordException {
        if (password.length() < 6) {
            throw new InvalidPasswordException("Invalid Password! Password must contain at lest 6 character");
        }
        System.out.println("Login successful");
    }
}
class Main02 {
    static void main(String[] args) {
        LoginSystem lg = new LoginSystem();
        try {
            lg.login("qpowk");
        }catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}