package Thread_AND_ThreadlifeCycle;

class OrderProcessor implements Runnable {
    @Override
    public void run(){
        System.out.println("Order processing start...");
        System.out.println("Preparing food...");
        System.out.println("food is read..");
        System.out.println("Order delivery successfully..");
    }
}
public class FoodDelivery {
    static void main(String[] args) {
        OrderProcessor order = new OrderProcessor();
        Thread t = new Thread(order);
        t.start();
    }
}
