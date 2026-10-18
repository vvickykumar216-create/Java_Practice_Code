package IO.Stream;

import java.io.FileWriter;
import java.io.IOException;

public class WriteWithFileWriter {
    static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("ddx.txt");
        fw.write("Hello world");
        fw.write("\nFile Handling");
        fw.close();
        FileWriter fw2 = new FileWriter("ddx.txt", true);
        fw2.write("\nthis is an extra line");
        fw2.close();
        System.out.println("Data written and appended successfully");
    }
}
