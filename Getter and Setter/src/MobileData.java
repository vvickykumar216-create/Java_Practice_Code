class dataPack{
    private double dataRemaining;
    public void setDataRemaining(double dataRemaining){
        this.dataRemaining = dataRemaining;
    }
    public double getDataRemaining(){
        return dataRemaining;
    }
}
public class MobileData {
    static void main(String[] args) {
        dataPack dp = new dataPack();
        dp.setDataRemaining(10.02);
        System.out.println("remaining data = "+ dp.getDataRemaining()+" GB");
    }
}
