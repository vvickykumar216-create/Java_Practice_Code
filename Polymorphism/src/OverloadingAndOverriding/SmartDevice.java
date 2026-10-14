package OverloadingAndOverriding;

public class SmartDevice {
    void connected(){
        System.out.println("Connect to the device");
    }
}
class WiFi extends SmartDevice{
    @Override
    void connected() {
        System.out.println("WiFi is connected to the device");
    }
}
class Bluetooth extends SmartDevice {
    @Override
    void connected() {
        System.out.println("Bluetooth is connecting to the devive");
    }
}
class NFC extends SmartDevice{
    @Override
    void connected() {
        System.out.println("NFC is connnected to the device");
    }
}
class main10 {
    static void main(String[] args) {
        SmartDevice sd;

        sd = new WiFi();
        sd.connected();

        sd = new Bluetooth();
        sd.connected();

        sd = new NFC();
        sd.connected();
    }
}