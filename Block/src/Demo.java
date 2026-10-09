public class Demo {
    static {
        System.out.println("Static Block");
    }
    {
        System.out.println("Instance Block");
    }

    static void main(String[] args) {
        System.out.println("Main Method");
        Demo d = new Demo();
    }
}
