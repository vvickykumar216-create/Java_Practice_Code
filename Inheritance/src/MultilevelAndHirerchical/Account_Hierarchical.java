package MultilevelAndHirerchical;

public class Account_Hierarchical {
    double balance = 10000;

    void showBalance(){
        System.out.println("Balance: " +balance);
    }
}
class SavingAccount extends Account_Hierarchical{
    void calculateInterest(){
        double interest = balance * 0.5;
        System.out.println("Saving Interest: "+ interest);
    }
}
class CurrentAccount extends SavingAccount{
    void calculateCharge(){
        double charge = 500;
        System.out.println("Current Account Charge: " + charge);
    }
}
class main{
    static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        s.showBalance();
        s.calculateInterest();

        CurrentAccount c = new CurrentAccount();
        c.showBalance();
        c.calculateCharge();
    }
}