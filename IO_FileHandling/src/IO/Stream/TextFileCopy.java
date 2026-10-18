package IO.Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TextFileCopy {
    static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("abc.txt");
        FileOutputStream fos = new FileOutputStream("copy.txt");
        int data;

        while ((data = fis.read()) != -1){
            fos.write(data);
        }
        fis.close();
        fos.close();
        System.out.println("File copied successfully. ");
    }
}
