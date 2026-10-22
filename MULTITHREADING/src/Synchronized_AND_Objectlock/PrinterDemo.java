package Synchronized_AND_Objectlock;

class Printer {

    private boolean printerBusy = false;

    public synchronized void printJob(String userName) {

        while (printerBusy) {

            System.out.println(userName + " printer ke liye wait kar raha hai...");

            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }


        printerBusy = true;

        System.out.println(userName + " printing start kar raha hai...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(userName + " printing complete.");


        printerBusy = false;


        notifyAll();
    }
}

public class PrinterDemo {

    public static void main(String[] args) {

        Printer printer = new Printer();

        Thread user1 = new Thread(
                () -> printer.printJob("User-1")
        );

        Thread user2 = new Thread(
                () -> printer.printJob("User-2")
        );

        Thread user3 = new Thread(
                () -> printer.printJob("User-3")
        );

        user1.start();
        user2.start();
        user3.start();
    }
}