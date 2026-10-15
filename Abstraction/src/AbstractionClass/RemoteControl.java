package AbstractionClass;

public abstract class RemoteControl {
    abstract void pressButton();

    void powerOn(){
        System.out.println("Remote is on");
    }
}
class TVRemote extends RemoteControl {
    @Override
    void pressButton() {
        System.out.println("TV channel changed");
    }
}
class Main05 {
    static void main(String[] args) {
       TVRemote remote = new TVRemote();

       remote.powerOn();
       remote.pressButton();
    }
}