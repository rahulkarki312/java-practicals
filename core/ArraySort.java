import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        Integer[] arr = new Integer[n];

        // Taking array elements as input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sorting the array in ascending order
        Arrays.sort(arr);

        System.out.println("Array in ascending order: " + Arrays.toString(arr));

        // Sorting the array in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Array in descending order: " + Arrays.toString(arr));

        scanner.close();
    }
}
