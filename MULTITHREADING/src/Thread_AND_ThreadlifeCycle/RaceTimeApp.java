package Thread_AND_ThreadlifeCycle;

class StopwatchThread extends Thread {
    @Override
    public void run() {
        System.out.println("Stopwatch Started...");
        for (int i = 1; i < 5; i++) {
            System.out.println("Time: " + i + " second");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Stopwatch Finish...");
    }
}
public class RaceTimeApp {
    static void main(String[] args) throws InterruptedException {
      StopwatchThread stopwatch =new StopwatchThread();
        System.out.println("Before start(): "+ stopwatch.getState()); //new
        stopwatch.start(); //runnable
        System.out.println("After start(): "+ stopwatch.getState());
        stopwatch.join();
        System.out.println("After completion: "+ stopwatch.getState()); //terminated
    }
}
