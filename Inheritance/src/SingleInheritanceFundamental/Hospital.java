package SingleInheritanceFundamental;

public class Hospital {
    String hospitalName = "Applo";
}
class EmergencyWard extends Hospital{
    void admitPatiend(){
        System.out.println("Hospital Name: "+ hospitalName);
        System.out.println("Petient Name: ABCD");
    }

    static void main(String[] args) {
        EmergencyWard ew = new EmergencyWard();
        ew.admitPatiend();
    }
}
