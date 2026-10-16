package MultilevelAndHirerchical;

public class User_Hierarchical {
    String name = "Ram";

    void showName(){
        System.out.println("User Name: "+ name);
    }
}
class Customer extends User_Hierarchical{
    void placeOrder(){
        System.out.println("Customer place order");
    }
}
class DeliveryPartner extends Customer{
    void deliveryOrder(){
        System.out.println("Delivery Partner Deliver the Order");
    }
}
class Main {
    static void main(String[] args) {
          Customer c = new Customer();
          c.showName();
          c.placeOrder();

          DeliveryPartner d = new DeliveryPartner();
          d.showName();
          d.deliveryOrder();
    }
}