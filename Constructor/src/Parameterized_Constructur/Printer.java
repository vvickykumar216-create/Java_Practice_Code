package Parameterized_Constructur;

public class Printer {
    String type;
    int pagePerMinute;

    Printer(String type, int pagePerMinute) {
        this.type = type;
        this.pagePerMinute = pagePerMinute;
    }

    Printer(int pagePerMinute, String type) {
        this.pagePerMinute = pagePerMinute;
        this.type = type;
    }

    static void main(String[] args) {
        Printer p1 = new Printer(20, "Laser");
        Printer p2 = new Printer("Laser", 15);

        System.out.println(p1.type + "  " + p1.pagePerMinute);
        System.out.println(p2.type + "  " + p2.pagePerMinute);
    }
}