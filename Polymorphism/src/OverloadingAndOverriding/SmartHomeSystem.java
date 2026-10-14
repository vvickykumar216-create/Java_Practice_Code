package OverloadingAndOverriding;

public class SmartHomeSystem {
    void controlDevice(){
        System.out.println("Control Electrical Device ");
    }
}
class AC extends SmartHomeSystem {
    @Override
    void controlDevice() {
        System.out.println("Ac is cooling the room");
    }
}
class Light extends SmartHomeSystem{
    @Override
    void controlDevice() {
        System.out.println("Light is turned ON");
    }
}
class Fan extends SmartHomeSystem{
    @Override
    void controlDevice() {
        System.out.println("Fan is turn OFF");
    }
}
class main11{
    static void main(String[] args) {
        SmartHomeSystem shd;

        shd = new AC();
        shd.controlDevice();

        shd = new Light();
        shd.controlDevice();

        shd = new Fan();
        shd.controlDevice();
    }
}