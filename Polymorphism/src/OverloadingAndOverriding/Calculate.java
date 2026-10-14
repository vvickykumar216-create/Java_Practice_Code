package OverloadingAndOverriding;
// Overloading
public class Calculate {
    int add(int a, int b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }
}
class Mani04{
    static void main(String[] args) {
        Calculate c = new Calculate();

        System.out.println("Sum of 2 number. "+ c.add(1,2));
        System.out.println("Sum of 3 number. "+ c.add(1, 2, 3));
    }
}