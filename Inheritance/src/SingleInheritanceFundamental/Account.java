package SingleInheritanceFundamental;

public class Account {
    void deposit(){
        System.out.println("Amount deposit successfully");
    }
}
class SavingAccount extends Account{
    void calculateInterest(){
        System.out.println("Interest calculage on saving account");
    }

    static void main(String[] args) {
        SavingAccount s1 = new SavingAccount();
        s1.deposit();
        s1.calculateInterest();
    }
}