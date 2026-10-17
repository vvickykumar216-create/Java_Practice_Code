package Try.with.resources;

class MyResource implements AutoCloseable {

    void useResource() {
        System.out.println("Resource is being used.");
    }

    @Override
    public void close() {
        System.out.println("Resource close() called.");
    }
}

public class TryWithFinally {

    static void main(String[] args) {

        try (MyResource resource = new MyResource()) {

            System.out.println("Inside try block.");

            resource.useResource();

        }
        finally {
            System.out.println("Finally block executed.");
        }
    }
}
