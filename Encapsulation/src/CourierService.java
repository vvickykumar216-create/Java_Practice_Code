class Service{
    private double packageWeight;
    public void setPackageWeight(double packageWeight){
        this.packageWeight = packageWeight;
    }
    public double getPackageWeight() {
        return packageWeight;
    }
    public double ServiceRate(){
        return getPackageWeight()*45;
    }
}
public class CourierService {
    static void main(String[] args) {
        Service s = new Service();
        s.setPackageWeight(10);
        System.out.println("cost of per kg = "+s.getPackageWeight());
        System.out.println("Total courier cost = "+s.ServiceRate());
    }
}
