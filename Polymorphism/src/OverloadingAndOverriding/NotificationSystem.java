package OverloadingAndOverriding;

public class NotificationSystem {
    void send(){
        System.out.println("Sending Notification");
    }
}
class Email extends NotificationSystem{
    @Override
    void send() {
        System.out.println("Sending notification through email");
    }
}
class SMS extends NotificationSystem{
    @Override
    void send() {
        System.out.println("Sending notification through SMS");
    }
}
class Push extends NotificationSystem{
    @Override
    void send() {
        System.out.println("Sending notification through Push Notification");
    }
}
class MainExacution {
    static void main(String[] args) {
        NotificationSystem n;

        n = new Email();
        n.send();

        n = new SMS();
        n.send();

        n = new Push();
        n.send();
    }
}