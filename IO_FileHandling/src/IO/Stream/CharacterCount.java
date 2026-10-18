package IO.Stream;

import java.io.FileReader;
import java.io.IOException;

public class CharacterCount {
    static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("abc.txt");
        int ch;
        int count = 0;
        while ((ch = fr.read()) != -1){
            count++;
        }
        fr.close();
        System.out.println("Total Character = "+count);
    }
}
