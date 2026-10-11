package Parameterized_Constructur;

public class Laptop {
    int ramSize;
    int storage;

    Laptop(int ramSize, int storage) {
        this.ramSize = ramSize;
        this.storage = storage;
    }

    static void main(String[] args) {
        Laptop l1 = new Laptop(16, 256);

        System.out.println("RAM: " + l1.ramSize + "GB");
        System.out.println("Storage: " + l1.storage + "GB");
    }
}
