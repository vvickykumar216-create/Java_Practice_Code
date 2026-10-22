package Thread_AND_ThreadlifeCycle;

/**
class PrintTask extends Thread {

    @Override
    public void run() {
        System.out.println("Printing document...");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Page " + i + " printed");
        }
    }
}

public class PrintQueueManager {

    public static void main(String[] args) {

        PrintTask task = new PrintTask();

        task.start();
    }
}

 */

class PrintTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Printing document...");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Page " + i + " printed");
        }
    }
}

public class PrintQueueManager {

    public static void main(String[] args) {

        PrintTask task = new PrintTask();

        Thread t = new Thread(task);

        t.start();
    }
}