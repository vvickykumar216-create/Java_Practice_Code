class EvCharging{
    private int chargingUnit;

    public void setChargingUnit(int chargingUnit) {
        this.chargingUnit = chargingUnit;
    }

    public int getChargingUnit() {
        return chargingUnit;
    }
    public int calculateBill(){
        return getChargingUnit()*15;
    }
}
public class EVChargingStation {
    static void main(String[] args) {
        EvCharging ev = new EvCharging();
        ev.setChargingUnit(10);
        System.out.println("Charging unit: "+ ev.getChargingUnit());
        System.out.println("Total bill: "+ ev.calculateBill());
    }
}
