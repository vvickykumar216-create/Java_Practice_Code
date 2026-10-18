package IO.Stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class lineBylineRead {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        String line;
        int lineNumber = 1;

        while ((line = br.readLine()) != null){
            System.out.println(lineNumber+ ": "+ line);
            lineNumber++;
        }
        br.close();
    }
}
