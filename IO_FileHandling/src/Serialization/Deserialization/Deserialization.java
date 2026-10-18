package Serialization.Deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("Student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s = (Student) ois.readObject();
        System.out.println("Name: "+ s.name);
        System.out.println("Age: "+ s.age);
        ois.close();
        fis.close();
    }
}
