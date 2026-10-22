package Synchronized_AND_Objectlock;

class ParkingLOt {
    private boolean slotAvailable = true;
    public synchronized void allocateSlot(String userName) {
        if (slotAvailable) {
            System.out.println(userName + " slot allocate kar rha hai...");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            slotAvailable = false;
            System.out.println(userName + " ko parking slot mil gaya");
        }else {
            System.out.println(userName + " ke liye slot available nhi hai");
        }
    }
}
public class ParkingDemoSynMethod {
    static void main(String[] args) {
        ParkingLOt parkingLOt = new ParkingLOt();
        Thread user1 = new Thread(() -> parkingLOt.allocateSlot("ram"),"User-1");
        Thread user2 = new Thread(() -> parkingLOt.allocateSlot("shayam"),"User2");

        user1.start();
        user2.start();

    }
}
