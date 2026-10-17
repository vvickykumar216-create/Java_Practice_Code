package Try.with.resources;
class MyResources implements AutoCloseable{
    void useResource(){
        System.out.println("Resource is being used. ");
    }

    @Override
    public void close()  {
        System.out.println("close() method call automatically");
    }
}
public class CustomResource {
    static void main(String[] args) {
        try(MyResources resource = new MyResources()) {
            System.out.println("Inside try block.");
            resource.useResource();
        }
        System.out.println("After try block");
    }
}
