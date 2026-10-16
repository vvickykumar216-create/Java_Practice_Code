package SingleInheritanceFundamental;

public class Subscription {
    String monthlyPlanName;
    double monthlyPrice;

    Subscription(String monthlyPlanName, double monthlyPrice){
        this.monthlyPlanName = monthlyPlanName;
        this.monthlyPrice = monthlyPrice;
    }
    void showPlanDetails(){
        System.out.println("Monthly Plan: " + monthlyPlanName);
        System.out.println("Monthly Price: " + monthlyPrice);
    }
}
class PremiumSubscription extends Subscription{
    double discount = 20;

    PremiumSubscription(String monthlyPlanName, double monthlyPrice){
        super(monthlyPlanName, monthlyPrice);
    }
    void calculateYearlySubscription(){
        double yearlyPrice = monthlyPrice * 12;
        double discountAmount = yearlyPrice * discount / 100;
        double finalPrice  = yearlyPrice - discountAmount;

        System.out.println("Yearly Price: Rs " + yearlyPrice);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Discount Amount: Rs " + discountAmount);
        System.out.println("Final Yearly Price: Rs " + finalPrice);
    }
}
class test {
    static void main(String[] args) {
       PremiumSubscription p = new PremiumSubscription("Premium", 500);

       p.showPlanDetails();
       p.calculateYearlySubscription();
    }
}