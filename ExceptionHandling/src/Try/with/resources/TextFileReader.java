package Try.with.resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {
    static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(("dta.txt")))) {
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException e){
            System.out.println("Error: "+ e.getMessage());
        }
        System.out.println("File resource automatically closed.");
    }
}
