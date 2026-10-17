package Try_Catch_Finally;

public class BankAccount {
    static void withdraw(double balance, double amount) {
        try {
            System.out.println("Withdrawal started");
            if (amount > balance) {
                throw new Exception("Insufficient balance");
            }
            balance = balance - amount;
            System.out.println("withdraw successful");
            System.out.println("Remaining balance: "+ balance);
        }catch (Exception e ) {
            System.out.println("Error: "+e.getMessage());
        }finally {
            System.out.println("Transaction log: Transaction complete");
        }
    }

    static void main(String[] args) {
        withdraw(5000, 7000);
    }
}

