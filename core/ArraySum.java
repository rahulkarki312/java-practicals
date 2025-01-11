import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        // Taking array elements as input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i]; // Adding elements to sum
        }

        // Displaying the sum of array elements
        System.out.println("Sum of the array elements: " + sum);

        scanner.close();
    }
}
