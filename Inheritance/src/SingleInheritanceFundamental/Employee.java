package SingleInheritanceFundamental;

public class Employee {
    void Work(){
        System.out.println("Employee are working");
    }
}
class Manager extends Employee{
    void approveLeave(){
        System.out.println("Approve the leave");
    }

    static void main(String[] args) {
        Manager m = new Manager();
        m.Work();
        m.approveLeave();
    }
}