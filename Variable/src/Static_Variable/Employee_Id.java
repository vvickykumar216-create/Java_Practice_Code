package Static_Variable;

class Employee{
    static int nextId = 1000;

    int id;
    String name;

    Employee(String name) {
        this.id = nextId++;
        this.name = name;
    }
    void display() {
        System.out.println("Employee Id= " + id);
        System.out.println("Employee Name= " + name);
        System.out.println();
    }
}
public class Employee_Id {
    static void main(String[] args) {

        Employee e1 = new Employee("Rahul");
        Employee e2 = new Employee("Bittu");

        e1.display();
        e2.display();
    }
}
