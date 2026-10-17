package Try_Catch_Finally;

public class User {
    String name = null;

    static void main(String[] args) {
        User u = new User();
        try {
            System.out.println(u.name.toUpperCase());
        }catch (NullPointerException e){
            System.out.println("Exception: Name is null");
        }
        System.out.println("Program continues");
    }
}
