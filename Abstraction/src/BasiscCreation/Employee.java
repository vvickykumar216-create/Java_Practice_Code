package BasiscCreation;

public abstract class Employee {
    abstract void CalculateSalary();
}
class Manager extends Employee{
    @Override
    void CalculateSalary() {
        System.out.println("Manager Salary = 8000$");
    }
}
class Developer extends Employee {
    @Override
    void CalculateSalary() {
        System.out.println("Developer Salary = 6000$");
    }
}
class Main04{
    static void main(String[] args) {
        Manager m = new Manager();
        m.CalculateSalary();

        Developer d = new Developer();
        d.CalculateSalary();
    }
}