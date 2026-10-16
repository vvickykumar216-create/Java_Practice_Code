package SingleInheritanceFundamental;

public class RideBooking {
    String vehicleRegistration;
    String driverName;

    RideBooking(String vehicleRegistration, String driverName){
        this.vehicleRegistration = vehicleRegistration;
        this.driverName = driverName;
    }
    void showVehicleDetail(){
        System.out.println("Vehicle Registration: "+vehicleRegistration);
        System.out.println("Driver Name: "+driverName);
    }
}
class Cab extends RideBooking{
    double distance;
    double ratePerKm = 18;
    Cab(String vehicleRegistration, String driverName, double distance){
        super(vehicleRegistration, driverName);
        this.distance = distance;
    }
    void calculateFare(){
        double fare = distance * ratePerKm;

        System.out.println("Distance: " + distance + " km");
        System.out.println("Rate: Rs " + ratePerKm + " per km");
        System.out.println("Total fare: Rs " + fare);
    }
}
class Test {
    static void main(String[] args) {
        Cab c = new Cab("BB07", "ram", 15);
        c.showVehicleDetail();
        c.calculateFare();
    }
}