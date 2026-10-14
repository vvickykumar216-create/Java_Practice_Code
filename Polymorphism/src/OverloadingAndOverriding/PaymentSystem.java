package OverloadingAndOverriding;

public class PaymentSystem {
    void pay(){
        System.out.println("Payment Processing");
    }
}
class UPI extends PaymentSystem{
    @Override
    void pay() {
        System.out.println("Payment done using UPI.");
    }
}
class Card extends UPI{
    @Override
    void pay() {
        System.out.println("Payment done by Using Card");
    }
}
class Cash extends Card{
    @Override
    void pay() {
        System.out.println("Payment done by using Cash.");
    }
}
class Main {
    static void main(String[] args) {
        PaymentSystem p1 = new UPI();
        p1.pay();

        PaymentSystem p2 = new Card();
        p1.pay();

        PaymentSystem p3 = new Cash();
        p3.pay();

//=============================================================
/*
    runtime polymorphism demonstrate

         PaymentSystem p;

        p = new UPI();
        p.pay();

        p = new Card();
        p.pay();

        p = new Cash();
        p.pay();
 */
    }
}