import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking number as input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Checking if the number is odd or even
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }

        scanner.close();
    }
}
