package BasiscCreation;

import java.util.concurrent.Callable;

public abstract class Shape {
    abstract void area();
}
class Circle extends Shape{
    @Override
    void area() {
        double radius = 5;
        System.out.println("Area = "+ Math.PI * radius * radius);
    }
}
class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    @Override
    void area() {
        double result = length * width;
        System.out.println("Rectangle Area = " + result);
    }
}
class Main01 {
    static void main(String[] args) {
        Circle c = new Circle();
        c.area();

        Rectangle r = new Rectangle();
        r.area();
    }
}