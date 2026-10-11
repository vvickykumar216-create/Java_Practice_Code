package Default_Constructor;

public class Digital_Alarm_Clock {

      String alarmTime;

    static void main(String[] args) {
        Digital_Alarm_Clock d1 = new Digital_Alarm_Clock();
        d1.alarmTime = "12:30 AM";
        System.out.println("Alarm time: " + d1.alarmTime);
    }
}
