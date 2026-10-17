package Try_Catch_Finally;

public class ResourceCleanup {
    static void useResource(){
        String resource = null;
        try {
            resource = "File Resource";
            System.out.println("Resource is opened");
        }finally {
            if (resource != null) {
                System.out.println("Resource is closed");
            }
        }
    }
    static void main(String[] args) {
        useResource();
    }
}
