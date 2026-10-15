package AbstractionClass;

public abstract class VehicleEngine {
    abstract void start();
    abstract void stop();
}
class PetrolEngine extends VehicleEngine {
    @Override
    void start() {
        System.out.println("petrol engine start with fuel");
    }

    @Override
    void stop() {
        System.out.println("Petrol engine stop.");
    }
}
class ElectricEngine extends VehicleEngine {
    @Override
    void start() {
        System.out.println("Electric engine Start with engine");
    }

    @Override
    void stop() {
        System.out.println("Electric engine stop");
    }
}
class Main07 {
    static void main(String[] args) {
        PetrolEngine petrol = new PetrolEngine();
        petrol.start();
        petrol.stop();

        ElectricEngine electric = new ElectricEngine();
        electric.start();
        electric.stop();
    }
}