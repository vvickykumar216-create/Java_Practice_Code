class fan{
    private int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
}
public class SmartFan {
    static void main(String[] args) {
        fan f = new fan();
        f.setSpeed(25);
        System.out.println("Speed of a fan = " + f.getSpeed() );
    }
}
