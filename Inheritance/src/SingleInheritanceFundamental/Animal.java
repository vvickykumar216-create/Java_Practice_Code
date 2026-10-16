package SingleInheritanceFundamental;

public class Animal {
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("Dog is barking");
    }

    static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
