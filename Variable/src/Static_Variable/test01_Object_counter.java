package Static_Variable;

class Student {

    static int count = 0;

    Student() {
        count++;
    }
    static int getCount(){
        return count;
    }
}
public class test01_Object_counter {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("After creating s1 " + Student.getCount());

        Student s2 = new Student();
        System.out.println("After creating s2: " + Student.getCount());

        Student s3 = new Student();
        System.out.println("After creating s3: " + Student.getCount());

        Student s4 = new Student();
        System.out.println("After creating s4: " + Student.getCount());
    }
}
