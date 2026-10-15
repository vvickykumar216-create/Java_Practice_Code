package AbstractionClass;

public abstract class Character {
  abstract void attack();
}
class Warrior extends Character {
    @Override
    void attack() {
        System.out.println("Warrior attacks with a sword");
    }
}
class Mage extends Character {
    @Override
    void attack() {
        System.out.println("Mage attacks with magic.");
    }
}
class Main09 {
    static void main(String[] args) {
        Warrior warrior = new Warrior();
        warrior.attack();

        Mage mage = new Mage();
        mage.attack();
    }
}