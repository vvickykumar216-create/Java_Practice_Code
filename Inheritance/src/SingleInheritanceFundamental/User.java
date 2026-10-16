package SingleInheritanceFundamental;

public class User {
    void longin(){
        System.out.println("Admin Loging Successful");
    }
}
class UserManagement extends User{
    void manageUser(){
        System.out.println("Massing User");
    }

    static void main(String[] args) {
        UserManagement um = new UserManagement();
        um.longin();
        um.manageUser();
    }
}