package AbstractionClass;

public abstract class Policy {
    Policy() {
        System.out.println("Policy constructor called");
    }
    abstract void premium();
}
class HealthPolicy extends Policy {
    HealthPolicy() {
        System.out.println("HeathPolicy constructor called");
    }

    @Override
    void premium() {
        System.out.println("health insurance premium is $5000");
    }
}
class LifePolicy extends Policy {
    LifePolicy(){
        System.out.println("LifePolicy constructor called");
    }

    @Override
    void premium() {
        System.out.println("Lice insurance premium is $8000");
    }
}
class Main10 {
    static void main(String[] args) {
        HealthPolicy health = new HealthPolicy();
        health.premium();

        LifePolicy life = new LifePolicy();
        life.premium();
    }
}