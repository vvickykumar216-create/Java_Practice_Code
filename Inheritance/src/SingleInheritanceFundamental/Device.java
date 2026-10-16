package SingleInheritanceFundamental;

public class Device {
    void powerOn(){
        System.out.println("Device is on");
    }
}
class Mobile extends Device{
    void makeCall(){
        System.out.println("Mobile is calling");
    }

    static void main(String[] args) {
        Mobile m = new Mobile();
        m.powerOn();
        m.makeCall();
    }
}