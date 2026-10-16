package SingleInheritanceFundamental;

public class OnlineShopping {
    double price = 1000;
}
class Electrical extends OnlineShopping{
    String warranty = "2 Years";

    void displayDetails(){
        double gst = price + 0.18;
        double finalPrice = price + gst;

        System.out.println("Product price: Rs. "+ price);
        System.out.println("Warranty: "+warranty);
        System.out.println("GST(18%): Rs. "+gst);
        System.out.println("Final Price: Rs. "+finalPrice);
    }

    static void main(String[] args) {
        Electrical e1 = new Electrical();
        e1.displayDetails();
    }
}
