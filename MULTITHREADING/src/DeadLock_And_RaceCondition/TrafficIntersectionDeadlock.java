package DeadLock_And_RaceCondition;

class Lane {
    private final String name;

    Lane(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Car implements Runnable {
    private final String carName;
    private final Lane currentlane;
    private final Lane nextLine;

    Car(String carName, Lane currentlane, Lane nextLine){
        this.carName = carName;
        this.currentlane = currentlane;
        this.nextLine = nextLine;
    }

    @Override
    public void run() {
        synchronized (currentlane) {
            System.out.println(carName+" acquired " + currentlane.getName());
        try {
            Thread.sleep(500);
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
            System.out.println(carName+" Waiting for "+ nextLine.getName());
        synchronized (nextLine) {
            System.out.println(carName+ " acquired "+ nextLine.getName());
            System.out.println(carName+" crossed intersection");
        }
        }
    }
}
public class TrafficIntersectionDeadlock {
    static void main(String[] args) {
        Lane lane1 = new Lane("Lane-1");
        Lane lane2 = new Lane("Lane-2");
        Lane lane3 = new Lane("Lane-3");
        Lane lane4 = new Lane("Lane-4");


        Thread car1 = new Thread(
                new Car("Car-1", lane1, lane2)
        );

        Thread car2 = new Thread(
                new Car("Car-2", lane2, lane3)
        );

        Thread car3 = new Thread(
                new Car("Car-3", lane3, lane4)
        );

        Thread car4 = new Thread(
                new Car("Car-4", lane4, lane1)
        );

        car1.start();
        car2.start();
        car3.start();
        car4.start();
    }
}
