package Interface;

public interface PaymentGateWay {
    void processPayment();
}
class UpiGatWay implements PaymentGateWay {
    @Override
    public void processPayment() {
        System.out.println("Payment Processed using Upi");
    }
}
class CreditCardGateWay implements PaymentGateWay {
    @Override
    public void processPayment() {
        System.out.println("Payment Processed using Card");
    }
}
class Main01 {
    static void main(String[] args) {
        PaymentGateWay Upi = new UpiGatWay();
        Upi.processPayment();

        PaymentGateWay card = new CreditCardGateWay();
        card.processPayment();
    }
}