package Parameterized_Constructur;

public class ElectricKettle {
    double capacityLiters;

    ElectricKettle(double capacityLiters) {
        if (capacityLiters > 0) {
            this.capacityLiters = capacityLiters;
        } else {
            System.out.println("Invalid capacity");
        }
    }

    static void main(String[] args) {
        ElectricKettle k1 = new ElectricKettle(1.5);
        System.out.println("Capacity: " + k1.capacityLiters + "Liter");
    }
}