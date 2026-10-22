package Synchronized_AND_Objectlock;
/**
class BankAccount {

    int balance = 1000;

    void withdraw(int amount) {

        System.out.println(Thread.currentThread().getName()
                + " checking balance: " + balance);

        if (balance >= amount) {

            System.out.println(Thread.currentThread().getName()
                    + " can withdraw " + amount);

            // Delay to make race condition visible
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance = balance - amount;

            System.out.println(Thread.currentThread().getName()
                    + " withdrawal successful");
        } else {
            System.out.println(Thread.currentThread().getName()
                    + " insufficient balance");
        }
    }
}

public class BankWithoutSynchronization {

    public static void main(String[] args) throws InterruptedException {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw(700), "Person-1");
        Thread t2 = new Thread(() -> account.withdraw(700), "Person-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance: " + account.balance);
    }
}

*/

class BankAccount  {

    int balance = 1000;

    synchronized void withdraw(int amount) {

        System.out.println(Thread.currentThread().getName()
                + " checking balance: " + balance);

        if (balance >= amount) {

            System.out.println(Thread.currentThread().getName()
                    + " can withdraw " + amount);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance = balance - amount;

            System.out.println(Thread.currentThread().getName()
                    + " withdrawal successful");

        } else {

            System.out.println(Thread.currentThread().getName()
                    + " insufficient balance");
        }
    }
}

public class BankAccountWithdrawal {

    public static void main(String[] args) throws InterruptedException {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw(700), "Person-1");
        Thread t2 = new Thread(() -> account.withdraw(700), "Person-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance: " + account.balance);
    }
}

