class foodDelivery{
    private double foodAmount;

    public void setFoodAmount(double foodAmount) {
        this.foodAmount = foodAmount;
    }

    public double getFoodAmount() {
        return foodAmount;
    }
    public double calculateFinalAmount(){
        double gst = getFoodAmount() * 0.05;
        double deliveryCharge = 40;
        return getFoodAmount() + gst + deliveryCharge;
    }
}
public class OnlineFoodDelivery {
    static void main(String[] args) {
        foodDelivery f = new foodDelivery();
        f.setFoodAmount(5000);
        System.out.println("Food Amount: Rs. "+ f.getFoodAmount());
        System.out.println("Final Bill: Rs. "+ f.calculateFinalAmount());
    }
}
