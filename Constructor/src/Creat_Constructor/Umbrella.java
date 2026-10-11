package Creat_Constructor;

public class Umbrella {
    String colour;
    Umbrella(String colour) {
        this.colour = colour;

    }
    static void main(String[] args) {

        Umbrella u1 = new Umbrella("Red");

        System.out.println("Umbrella colour: " + u1.colour);
    }
}
