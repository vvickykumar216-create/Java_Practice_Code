package Non_Parameterized_Constructor;

public class CoffeeMechine {
    int waterLevel;

    CoffeeMechine() {
        waterLevel = 0;
    }
    CoffeeMechine(int waterLevel) {
        this.waterLevel = waterLevel;
    }

    static void main(String[] args) {
        CoffeeMechine c1 = new CoffeeMechine();
        CoffeeMechine c2 = new CoffeeMechine(1000);

        System.out.println("c1 water level: " + c1.waterLevel);
        System.out.println("c2 water level: " +c2.waterLevel);
    }
}
