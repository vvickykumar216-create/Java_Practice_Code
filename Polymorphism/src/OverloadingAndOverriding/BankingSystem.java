package OverloadingAndOverriding;

public class BankingSystem {
    void withdraw(double amount) {
        System.out.println("Withdrawal from account: " + amount);
    }
}

class SavingsAccount extends BankingSystem {

    @Override
    void withdraw(double amount) {
        System.out.println("Savings Account: Withdrawal of ₹" + amount);
        System.out.println("Withdrawal allowed with sufficient balance.");
    }
}

class CurrentAccount extends BankingSystem {

    @Override
    void withdraw(double amount) {
        System.out.println("Current Account: Withdrawal of ₹" + amount);
        System.out.println("Withdrawal allowed with overdraft facility.");
    }
}
 class Main07 {
    public static void main(String[] args) {

        BankingSystem a1 = new SavingsAccount();
        BankingSystem a2 = new CurrentAccount();

        a1.withdraw(5000);
        a2.withdraw(10000);
    }
}

