package MultilevelAndHirerchical;

public class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void showPersonDetail(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }
}
class Teacher extends Person{
    String subject;

    Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }
    void showTeacherDetails(){
        System.out.println("Subject: "+ subject);
    }
}
class HOD extends Teacher{
    String department;
    HOD(String name, int age, String subject, String department){
        super(name, age, subject);
        this.department = department;
    }
    void showDepartmentDetail(){
        System.out.println("Department: "+ department);
        System.out.println("HOD is managing of the department.");
    }
}
class test {
    static void main(String[] args) {
        HOD h = new HOD("akashy", 32, "Math", "CSE");

        h.showPersonDetail();
        h.showTeacherDetails();
        h.showDepartmentDetail();
    }
}