package Creat_Constructor;

public class SmartSpeaker {
    String deviceName;

    SmartSpeaker(String name) {
        deviceName = name;
    }
    static void main(String[] args) {

        SmartSpeaker s1 = new SmartSpeaker("Alexa");
        System.out.println(s1.deviceName);
    }
}
