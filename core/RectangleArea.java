import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking length and breadth as input
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Calculating the area of the rectangle
        double area = length * breadth;

        // Displaying the area
        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}
