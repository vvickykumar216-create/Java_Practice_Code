package OverloadingAndOverriding;

public class OrderingFood {
    void order(){
        System.out.println("Food is ordering");
    }
}
class Pizza extends OrderingFood{
    @Override
    void order() {
        System.out.println("Pizza is Ordering");
    }
}
class Burger extends OrderingFood {
    @Override
    void order() {
        System.out.println("Burger iis ordering");
    }
}
class Pasta extends OrderingFood{
    @Override
    void order() {
        System.out.println("Pasta is ordering");
    }
}
class Main06 {
    static void main(String[] args) {
        OrderingFood f;

        f = new Pizza();
        f.order();

        f = new Burger();
        f.order();

        f = new Pasta();
        f.order();
    }
}