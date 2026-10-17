package Try_Catch_Finally;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderSimulation {

    static void readFile() throws FileNotFoundException{
        FileReader file = new FileReader("student.txt");
        System.out.println("File opened successfully");
    }

    static void main(String[] args) {
        try {
            readFile();
        }catch (FileNotFoundException e) {
            System.out.println("Specific catch: file not found!");
        }catch (Exception e) {
            System.out.println("Generic catch: some error occurred!");
        }
        System.out.println("Program continues");
    }
}
