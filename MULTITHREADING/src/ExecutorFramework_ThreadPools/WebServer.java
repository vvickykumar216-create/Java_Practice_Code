package ExecutorFramework_ThreadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class RequestHandler implements Runnable {

    private final int requestId;

    RequestHandler(int requestId) {
        this.requestId = requestId;
    }

    @Override
    public void run() {
        System.out.println("Request "+ requestId +" handle by "+ Thread.currentThread().getName());
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Request " + requestId + " completed");
    }
}
public class WebServer {
    static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();

        for (int i = 1; i <= 10; i++) {
            pool.execute(new RequestHandler(i));
        }
        pool.shutdown();
    }
}
