package BasiscCreation;

 abstract class Vehicle {
    abstract void stat();
}
class car extends Vehicle {
    @Override
    void stat() {
        System.out.println("Car start with a key.");
    }
}
class Bike extends Vehicle{
    @Override
    void stat() {
        System.out.println("Bike is start with a self-start button");
    }
}
 class Main{
    static void main(String[] args) {
        Vehicle v1 = new car();
        Vehicle v2 = new Bike();

        v1.stat();
        v2.stat();
    }
}
