package SingleInheritanceFundamental;

public class Vehicle {
    void startEngine(){
        System.out.println("Vehicle engine started");
    }
}
class Bike extends Vehicle{
    static void main(String[] args) {
        Bike b = new Bike();
        b.startEngine();
    }
}