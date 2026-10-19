class metroCard{
    private double balance;
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
}
public class Test01_MetroCard {
    static void main(String[] args) {
        metroCard m = new metroCard();
        m.setBalance(100.25);
        System.out.println("Metro card balance: " + m.getBalance());
    }
}
