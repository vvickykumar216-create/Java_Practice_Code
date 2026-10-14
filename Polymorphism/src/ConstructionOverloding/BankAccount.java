package ConstructionOverloding;

public class BankAccount {
    String name;
    int accountNo;
    double balance;

    // Constructor 1
    BankAccount(String name) {
        this.name = name;
    }

    // Constructor 2
    BankAccount(String name, int accountNo) {
        this.name = name;
        this.accountNo = accountNo;
    }

    // Constructor 3
    BankAccount(String name, int accountNo, double balance) {
        this.name = name;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void display() {
        System.out.println(name + " " + accountNo + " " + balance);
    }
}

 class Main {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount("Rahul");

        BankAccount b2 = new BankAccount("Amit", 101);

        BankAccount b3 = new BankAccount("Vicky", 102, 5000);

        b1.display();
        b2.display();
        b3.display();
    }
}

