package Synchronized_AND_Objectlock;
class ParkingLot {
    private boolean slotAvailable = true;
    public void allocateSlot(String userName) {
        System.out.println(userName + " parking lot main aa gya");
        System.out.println(userName + "parking details check kar rha hai..");
        synchronized (this) {
            if (slotAvailable) {
                System.out.println(userName +" slot allocate kr rha hai...");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e) {
                    Thread .currentThread().interrupt();
                }
                slotAvailable = false;
                System.out.println(userName + " ko parking slote mil gya");
            }else {
                System.out.println(userName + " ke liye slot available nhi hai");
            }
        }
    }
}
public class ParkingDemoSynBlock {
    static void main(String[] args) {
        ParkingLot parkingLOt = new ParkingLot();
        Thread user1 = new Thread(
                () -> parkingLOt.allocateSlot("Ram")
        );

        Thread user2 = new Thread(
                () -> parkingLOt.allocateSlot("Shayam")
        );
        user1.start();
        user2.start();
    }
}
