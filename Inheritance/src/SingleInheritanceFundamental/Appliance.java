package SingleInheritanceFundamental;

public class Appliance {
    void Switch(){
        System.out.println("Switch is on");
    }
}
class Fan extends Appliance{
    void changeSpeed(){
        System.out.println("Change the speed of fan");
    }

    static void main(String[] args) {
        Fan f = new Fan();
        f.Switch();
        f.changeSpeed();
    }
}