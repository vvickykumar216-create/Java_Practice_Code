class ShoppingCard{
    private int quantity;
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
}
public class OnlineShoppingCard {
    static void main(String[] args) {
        ShoppingCard s1 = new ShoppingCard();
        s1.setQuantity(5000);
        System.out.println("Shopping card balance = "+ s1.getQuantity()+"$");
    }
}
