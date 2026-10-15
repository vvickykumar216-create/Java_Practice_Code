package AbstractionClass;

public abstract class BankAccount {

    void checkBalance(){
        System.out.println("Checking account balance...");
    }
    abstract void applyInterest();
}
class SavingAccount extends BankAccount {
    @Override
    void applyInterest() {
        System.out.println("Saving Account: 5% interest applied");
    }
}
class Main04 {
    static void main(String[] args) {
        SavingAccount sc = new SavingAccount();

        sc.applyInterest();
        sc.checkBalance();
    }
}