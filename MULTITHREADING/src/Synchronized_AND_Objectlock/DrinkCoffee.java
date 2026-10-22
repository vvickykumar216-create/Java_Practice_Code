package Synchronized_AND_Objectlock;
class  CoffeeMachine {
    private boolean coffeeAvailable = false;
    //producer
    public synchronized void makeCoffee() {
        while (coffeeAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Producer: coffee ban rha hai...");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        coffeeAvailable = true;
        System.out.println("Producer: Coffee ready hai ");
        notify();
    }
    //consumer
    public synchronized void drinkCoffee(){
        while (!coffeeAvailable) {
            try {
                System.out.println("Consumer: coffee ka wait kar raha hai..");
                wait();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumer coffee pi rha hai...");
        coffeeAvailable = false;
        notify();
    }
}
public class DrinkCoffee {
    static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        Thread producer = new Thread(() -> {
            for (int i=1; i<=5; i++){
                machine.makeCoffee();
            }
        }, "Producer");
        Thread consumer = new Thread(() ->
        {
            for (int i = 0; i < 5; i++) {
                machine.drinkCoffee();
            }
        }, "consumer");
        producer.start();
        consumer.start();
    }
}
