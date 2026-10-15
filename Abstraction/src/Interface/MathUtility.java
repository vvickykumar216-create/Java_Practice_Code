package Interface;

public class MathUtility {
    static int square(int n) {
        return n * n;
    }
}
class Main05 {
    static void main(String[] args) {
        int result = MathUtility.square(5);
        System.out.println("Square = " + result);
    }
}