package Non_Parameterized_Constructor;

public class SolarPanel {
    int capacityWatt;

    SolarPanel(){
        capacityWatt = 50;
        System.out.println("SolarPanel constructor called");
    }
}
class Panel extends SolarPanel {
    Panel() {
        System.out.println("Panel constructor called");
    }

    static void main(String[] args) {
        Panel p1 = new Panel();
        System.out.println("Capacity= "+ p1.capacityWatt +" Watt");
    }
}
