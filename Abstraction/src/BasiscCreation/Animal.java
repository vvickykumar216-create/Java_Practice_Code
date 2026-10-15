package BasiscCreation;

public abstract class Animal {
    abstract void sound();
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dod are barking");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Car are speaking meow meow");
    }
}
class Main03 {
    static void main(String[] args) {
    Dog d = new Dog();
    d.sound();

    Cat c = new Cat();
    c.sound();
    }
}