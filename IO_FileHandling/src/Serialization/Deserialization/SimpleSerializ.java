package Serialization.Deserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class SimpleSerializ {
    static void main(String[] args) throws IOException {
        Student s = new Student("ram",20);
        FileOutputStream fos = new FileOutputStream("Student.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.close();
        fos.close();
        System.out.println("Object serialize successfully.");
    }
}
