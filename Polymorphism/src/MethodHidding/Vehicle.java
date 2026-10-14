package MethodHidding;

public class Vehicle {
    static void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {

    static void start() {
        System.out.println("Car starts with key");
    }
}

class Bike extends Vehicle {

    static void start() {
        System.out.println("Bike starts with self-start");
    }
}

 class Main {

    public static void main(String[] args) {

        Vehicle.start();
        Car.start();
        Bike.start();
    }
}

