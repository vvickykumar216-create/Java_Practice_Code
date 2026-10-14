package OverloadingAndOverriding;

public class RidingBookApp {
    void discount(){
        System.out.println("Calculate fide Fare");
    }
}
class Auto extends RidingBookApp{
    @Override
    void discount() {
        System.out.println("Auto Fare: 80$");
    }
}
class Cab extends RidingBookApp{
    @Override
    void discount() {
        System.out.println("Cab Fare: 120$");
    }
}
class bike extends RidingBookApp{
    @Override
    void discount() {
        System.out.println("Bike Fare: 50$");
    }
}
class Main08{
    static void main(String[] args) {
        RidingBookApp rd;

        rd = new Auto();
        rd.discount();

        rd = new Cab();
        rd.discount();

        rd = new bike();
        rd.discount();
    }
}