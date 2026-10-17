package CustomException;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}
public class BankAccount {
    double balance = 5000;
    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("InsufficientBalance! Available balance: "+ balance);
        }
        balance = balance - amount;
        System.out.println("Withdraw Successful");
        System.out.println("Remaining Balance: "+ balance);
    }
}
class Main {
    static void main(String[] args) {
        BankAccount account = new BankAccount();
        try {
            account.withdraw(7000);
        }catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}