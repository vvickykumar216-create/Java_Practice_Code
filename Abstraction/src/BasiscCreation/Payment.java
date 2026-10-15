package BasiscCreation;

abstract class Payment {
    abstract void pay();
}
class CardPayment extends Payment{
    @Override
    void pay() {
        System.out.println("Payment made using Card");
    }
}
class CashPayment extends Payment{
    @Override
    void pay() {
        System.out.println("Payment made using Cash");
    }
}
class Main02 {
    static void main(String[] args) {

       CardPayment c1 = new CardPayment();
       c1.pay();

       CashPayment c2 = new CashPayment();
       c2.pay();
    }
}