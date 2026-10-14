package OverloadingAndOverriding;

public class VehicleStart {
    void start(){
        System.out.println("Vehicle are Start");
    }
}
class Car extends VehicleStart{
    @Override
    void start() {
        System.out.println("Car is Starting. ");
    }
}
class Bike extends VehicleStart{
    @Override
    void start() {
        System.out.println("Bike is Starting. ");
    }
}
class Bus extends VehicleStart{
    @Override
    void start() {
        System.out.println("Bus is Starting. ");
    }
}
class Main03 {
    static void main(String[] args) {
        VehicleStart v;

        v = new Car();
        v.start();

        v = new Bike();
        v.start();

        v = new Bus();
        v.start();
    }
}