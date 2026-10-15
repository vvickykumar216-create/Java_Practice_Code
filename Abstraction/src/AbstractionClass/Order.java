package AbstractionClass;

public abstract class Order {
    double price;

    Order(double price) {
        this.price = price;
    }
    abstract void calculateTotal();
}
class DomesticOrder extends Order {

    DomesticOrder(double price){
        super(price);
    }

    @Override
    void calculateTotal() {
        double shippingChange = 50;
        double total = price + shippingChange;

        System.out.println("Domestic Order Total: "+ total);
    }
}
class InternationOrder extends Order{

    InternationOrder(double price) {
        super(price);
    }

    @Override
    void calculateTotal() {
        double shippingCharge = 500;
        double total = price + shippingCharge;

        System.out.println("Internation Order Total: "+ total);
    }
}
class Main08 {
    static void main(String[] args) {
        DomesticOrder domestic = new DomesticOrder(1000);
        domestic.calculateTotal();

        InternationOrder international = new InternationOrder(1000);
        international.calculateTotal();
    }
}