package Thread_AND_ThreadlifeCycle;
class MessageListener extends Thread {
    @Override
    public void run() {
        synchronized (this){
            System.out.println("Listener: new msg ka wait kar raha hai...");
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Listener: new msg received");
        }
    }
}
public class ChatAppMsg {
    static void main(String[] args) throws InterruptedException {
        MessageListener listener = new MessageListener();
        System.out.println("Before start(): "+ listener.getState());
        listener.start();
        Thread.sleep(100);
        System.out.println("While waiting: "+ listener.getState());
        synchronized (listener) {
            listener.notify();
        }
        listener.join();
        System.out.println("After completion "+ listener.getState());
    }
}
