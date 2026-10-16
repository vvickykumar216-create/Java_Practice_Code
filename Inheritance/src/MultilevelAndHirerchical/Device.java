package MultilevelAndHirerchical;

public class Device {
    String deviceName;

    Device(String deviceName) {
        this.deviceName = deviceName;
    }

    void showDevice() {
        System.out.println("Device Name: " + deviceName);
    }
}

class SmartDevice extends Device {
    boolean wifiConnected;

    SmartDevice(String deviceName, boolean wifiConnected) {
        super(deviceName);
        this.wifiConnected = wifiConnected;
    }

    void showConnectionStatus() {
        System.out.println("WiFi Connected: " + wifiConnected);
    }
}

class SmartAC extends SmartDevice {
    int temperature;

    SmartAC(String deviceName, boolean wifiConnected, int temperature) {
        super(deviceName, wifiConnected);
        this.temperature = temperature;
    }

    void controlTemperature(int newTemperature) {
        temperature = newTemperature;
        System.out.println("Temperature Set To: " + temperature + "°C");
    }

    void autoSchedule() {
        System.out.println("Auto Schedule: AC will turn ON at 6:00 PM");
    }
}

class Test {
    public static void main(String[] args) {

        SmartAC ac = new SmartAC(
                "Smart AC",
                true,
                24
        );

        ac.showDevice();
        ac.showConnectionStatus();
        ac.controlTemperature(22);
        ac.autoSchedule();
    }
}

