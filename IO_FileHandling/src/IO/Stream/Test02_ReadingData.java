package IO.Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test02_ReadingData {
    static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("abc.txt");
        int data;
        while ((data = fis.read()) != -1) {
            System.out.println((char) data);
        }
    }
}
