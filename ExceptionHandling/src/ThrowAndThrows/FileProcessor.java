package ThrowAndThrows;

import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
    static void processorFile() throws IOException {
        FileReader file = new FileReader("student.txt");
        System.out.println("File opened successfully");
        file.close();

    }

    static void main(String[] args) {
        try {
            processorFile();
        }catch (IOException e ) {
            System.out.println("Error: Unable to read file");
        }
        System.out.println("Program continues...");
    }
}
