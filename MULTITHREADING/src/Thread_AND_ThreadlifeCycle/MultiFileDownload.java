package Thread_AND_ThreadlifeCycle;
class FileDownloadTask implements Runnable {
    private String fileName;

    FileDownloadTask(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println(fileName + "download start..");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(fileName + "download complete");
    }
}
public class MultiFileDownload {
    static void main(String[] args) {
        Runnable task1 = new FileDownloadTask("movi.mp4");
        Runnable task2 = new FileDownloadTask("Photo.jpg");
        Runnable task3 = new FileDownloadTask("Document.pdf");

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

        t1.start();
        t2.start();
        t3.start();
    }
}
