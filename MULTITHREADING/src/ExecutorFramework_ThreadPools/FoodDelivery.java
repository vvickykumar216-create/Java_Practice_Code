package ExecutorFramework_ThreadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class FoodOrder implements Runnable {
    private int orderId;

    FoodOrder(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public void run() {
        System.out.println("Order" + orderId + " is being processed by " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Order " + orderId + " completed");
    }
}
public class FoodDelivery {
    static void main(String[] args) {

        //create a pool of 3 worker threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        //Submit 6 food orders
        for (int i =  1; i <= 6; i++) {
            executor.submit(new FoodOrder(i));
        }
        //stop accepting new task
        executor.shutdown();
    }
}
