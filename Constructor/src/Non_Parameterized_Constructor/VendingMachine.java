package Non_Parameterized_Constructor;

public class VendingMachine {
    int itemCount;
          //no-argument
    VendingMachine() {
        itemCount = 0;
    }

    static void main(String[] args) {
        VendingMachine v1 = new VendingMachine();
        System.out.println("Item Count: " + v1.itemCount);

    }
}
