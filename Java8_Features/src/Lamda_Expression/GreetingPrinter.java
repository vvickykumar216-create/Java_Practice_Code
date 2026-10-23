package Lamda_Expression;

/**  Lemda expretion runnable

public class GreetingPrinter {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello Lambda");
        r.run();
    }
}
 */

//anonymous inner class

public class GreetingPrinter {
    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {System.out.println("Hello Lambda");}
        };
        r.run();
    }
}