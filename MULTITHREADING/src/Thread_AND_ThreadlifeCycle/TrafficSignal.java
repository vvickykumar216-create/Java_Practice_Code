package Thread_AND_ThreadlifeCycle;

class RedLightThread extends Thread{
    @Override
    public void run() {
        System.out.println("Red Light on");
        System.out.println("Vehicle stop");
    }
}
public class TrafficSignal {
    static void main(String[] args) {
        RedLightThread red = new  RedLightThread();
        red.start();
    }
}
