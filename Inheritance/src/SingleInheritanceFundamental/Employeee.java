package SingleInheritanceFundamental;

public class Employeee {
    double salary = 5000000;
}
class SoftwareEngineer extends Employeee{
    void calculateBonus(){
        double bonus = salary * 0.10;
        System.out.println("Salary: "+ salary);
        System.out.println("Bonus: "+ bonus);
    }

    static void main(String[] args) {
        SoftwareEngineer se = new SoftwareEngineer();
        System.out.println("Salary:: "+ se.salary);
        se.calculateBonus();
    }
}
