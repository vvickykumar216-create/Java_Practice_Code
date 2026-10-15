package Interface;

public interface Swimmable {
    void swim();
}
interface Flyable {
    void flay();
}
class Duck implements Swimmable, Flyable {
    @Override
    public void swim() {
        System.out.println("Duck can Swim.");
    }

    @Override
    public void flay() {
        System.out.println("Duck can flay");
    }
}
class Main02 {
    static void main(String[] args) {
        Duck d = new Duck();
        d.flay();
        d.swim();

    }
}