package Parameterized_Constructur;

public class AirPurifier {
    int roomSize;

    AirPurifier() {
        this(20);
    }
    AirPurifier(int roomSize) {
        this.roomSize = roomSize;
    }
}

class SmartPurifier extends AirPurifier {
    SmartPurifier() {
        super(30);
    }

    static void main(String[] args) {
        SmartPurifier s1 = new SmartPurifier();
        System.out.println("Room Size: " + s1.roomSize);
    }
        }
