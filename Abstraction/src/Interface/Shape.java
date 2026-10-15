package Interface;

public interface Shape {
    void area();
    void perimeter();
}
class Square implements Shape {
    int side = 5;

    @Override
    public void area() {
        int result = side * side;
        System.out.println("Area of Square = " + result);
    }

    @Override
    public void perimeter() {
        int result = 4 * side;
        System.out.println("Perimeter of Square = " + result);
    }
}
class Main10 {
    static void main(String[] args) {
        Square square = new Square();

        square.area();
        square.perimeter();
    }
}