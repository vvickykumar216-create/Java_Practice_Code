package Interface;

public interface  Printable {
    void print();
}
class InkjetPrinter implements Printable {
    @Override
    public void print() {
        System.out.println("Inkjet printer is Printing a document.");
    }
}
class Main {
    static void main(String[] args) {

        InkjetPrinter printer = new InkjetPrinter();
        printer.print();
    }
}