import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the number as input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int originalNum = num;
        int reversedNum = 0;

        // Reversing the number
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        // Checking if the number is a palindrome
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }

        scanner.close();
    }
}
