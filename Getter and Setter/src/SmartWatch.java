class Watch{
    private int steps;
    public void setSteps(int steps){
        this.steps = steps;
    }
    public double getSteps(){
        return steps;
    }
}
public class SmartWatch {
    static void main(String[] args) {
        Watch w = new Watch();
        w.setSteps(20);
        System.out.println("Step: "+ w.getSteps());
    }
}
