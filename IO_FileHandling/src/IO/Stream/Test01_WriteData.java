package IO.Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_WriteData {
    static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("abc.txt");
        fos.write(97);
        fos.write(98);
        fos.flush();
        fos.close();
    }
}
