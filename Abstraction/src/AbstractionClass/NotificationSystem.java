package AbstractionClass;

public abstract class NotificationSystem {
    abstract void send();

    void logNotification() {
        System.out.println("Notification has been logged");
    }
}
class EmailNotification extends NotificationSystem {
    @Override
    void send() {
        System.out.println("Sending Email Notification");
    }
}
class SMSNotification extends NotificationSystem {
    @Override
    void send() {
        System.out.println("Sending SMS Notification...");
    }
}
class Main06 {
    static void main(String[] args) {

        EmailNotification en = new EmailNotification();
        en.send();
        en.logNotification();
    }
}