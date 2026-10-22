package ExecutorFramework_ThreadPools;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ImageResizer implements Callable<String> {

    private  final String imageName;

    ImageResizer(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public String call() throws Exception {
        System.out.println(imageName+" resize by " + Thread.currentThread().getName());
        Thread.sleep(2000);
        return imageName + " resize successfully";
    }
}
public class BulkPhotoResize {
    static void main(String[] args) throws Exception {

        ExecutorService pool = Executors.newFixedThreadPool(3);

        Future<String> f1 = pool.submit(new ImageResizer("photo1.jpg"));

        Future<String> f2 = pool.submit(new ImageResizer("photo2.jpg"));

        Future<String> f3 = pool.submit(new ImageResizer("photo3.jpg"));

        System.out.println("f1 done: " + f1.isDone());
        System.out.println("f2 cancelled: " + f2.isCancelled());

        System.out.println("Result: " + f1.get());
        System.out.println("Result: " + f2.get());
        System.out.println("Result: " + f3.get());

        System.out.println("f1 done: " + f1.isDone());
        System.out.println("f2 cancelled: " + f2.isCancelled());

        pool.shutdown();
    }
}
