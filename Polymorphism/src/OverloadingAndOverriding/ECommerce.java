package OverloadingAndOverriding;

public class ECommerce {

    // Flat Discount
    double discount(double price, double flatDiscount) {
        double finalPrice = price - flatDiscount;
        return finalPrice;
    }

    // Percentage Discount
    double discount(double price, int percentage) {
        double discountAmount = price * percentage / 100;
        double finalPrice = price - discountAmount;
        return finalPrice;
    }
}

class Main09 {
    public static void main(String[] args) {

        ECommerce e = new ECommerce();

        // ₹2000 price, ₹200 flat discount
        double finalPrice1 = e.discount(2000,200.50);

        // ₹2000 price, 10% percentage discount
        double finalPrice2 = e.discount(2000, 10);
        System.out.println("Original price 2000");
        System.out.println("After Flat Discount: ₹" + finalPrice1);
        System.out.println("After Percentage Discount: ₹" + finalPrice2);
    }
}