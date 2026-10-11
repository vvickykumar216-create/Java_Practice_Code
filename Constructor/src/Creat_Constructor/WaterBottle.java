package Creat_Constructor;

public class WaterBottle {

    String capacityMI;

    WaterBottle(String capacityMI) {
        this.capacityMI = capacityMI;
    }
    static void main(String[] args) {

        WaterBottle w1 = new WaterBottle("1 Lit");
        System.out.println("Bottle Capacity: " + w1.capacityMI);
    }
}
