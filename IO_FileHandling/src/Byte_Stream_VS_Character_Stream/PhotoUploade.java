package Byte_Stream_VS_Character_Stream;

import java.io.FileInputStream;
import java.io.IOException;

public class PhotoUploade {
    static void main(String[] args) {

        String filePath = "photo.jpg";

        try(FileInputStream fis = new FileInputStream(filePath)) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.println(data + " ");
            }
            System.out.println("image file read successfully..");
        }catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
