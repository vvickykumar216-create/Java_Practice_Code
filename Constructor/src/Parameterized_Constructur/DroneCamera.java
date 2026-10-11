package Parameterized_Constructur;

public class DroneCamera {
    String resolution;

    DroneCamera(String resolution) {
        this.resolution = resolution;
    }

    static void main(String[] args) {
        DroneCamera dc = new DroneCamera("4K");

        System.out.println("Resolution: " + dc.resolution);
    }
}
