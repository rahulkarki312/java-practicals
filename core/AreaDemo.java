import Area.Rectangle;
import Area.Circle;
import Area.Square;

public class AreaDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Circle circle = new Circle();
        Square square = new Square();

        // Displaying areas
        System.out.println("Area of Rectangle: " + rect.area(10, 5));
        System.out.println("Area of Circle: " + circle.area(7));
        System.out.println("Area of Square: " + square.area(4));
    }
}
