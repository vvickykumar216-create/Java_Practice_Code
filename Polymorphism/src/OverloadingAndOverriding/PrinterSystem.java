package OverloadingAndOverriding;

public class PrinterSystem {
    void print(String text){
        System.out.println("Printing text "+ text);
    }
    void print(String imageName, int Width, int height){
        System.out.println("Printing Image: "+ imageName);
        System.out.println("Size: " + Width + " x " + height);
    }
    void print(String fileName, double filesize) {
        System.out.println("Printing File: " + fileName);
        System.out.println("File Size: " + filesize + " MB");
    }
}
class Main05{
    static void main(String[] args) {
        PrinterSystem p = new PrinterSystem();

        p.print("Hello Java");
        p.print("Photo.jpg", 1920, 1080);
        p.print("Resume.pdf", 2.5);
    }
}