package Interface;

public interface Vehicle {
    default void honk(){
        System.out.println("Vehicle is honking.");
    }
}
class Bike implements Vehicle {

}
class Main04 {
    static void main(String[] args) {
        Bike b = new Bike();
        b.honk();
    }
}