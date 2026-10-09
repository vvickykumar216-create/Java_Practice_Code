class parking{
    {
        int hours = 4;
        int feePerHour = 20;

        int totalFee = hours*feePerHour;

        System.out.println("Parking Hour = "+hours);
        System.out.println("Fee Per Hour = "+feePerHour);
        System.out.println("Total fee = "+totalFee);
    }
}
public class ParkingSystem {
    static void main(String[] args) {
        parking p = new parking();
    }
}
