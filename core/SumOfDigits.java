import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking number as input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = 0;

        // Extracting digits and calculating the sum
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        // Displaying the sum of digits
        System.out.println("The sum of digits is: " + sum);

        scanner.close();
    }
}
