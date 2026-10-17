package Catch.with.multiresource;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileOperation {
  static void readFile() throws IOException {
      FileReader fr = new FileReader("data.txt");

      int ch;
      while ((ch = fr.read()) != -1) {
          System.out.println((char) ch);
      }
      fr.close();
  }

    static void main(String[] args) {
        try {
            readFile();
        }catch (FileNotFoundException | SecurityException e) {
            System.out.println("file operation error: "+ e.getMessage());
        }catch (IOException e) {
            System.out.println("IO error: "+ e.getMessage());
        }
    }
}
