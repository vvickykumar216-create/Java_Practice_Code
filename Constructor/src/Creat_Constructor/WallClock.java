package Creat_Constructor;

public class WallClock {

    String brandName;

    WallClock(String brandName) {
        this.brandName = brandName;
    }
    static void main(String[] args) {

        WallClock w1 = new WallClock("Mechenical Watch");
        System.out.println(w1.brandName);
    }
}
