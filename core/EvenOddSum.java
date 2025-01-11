public class EvenOddSum {
    public static void main(String[] args) {
        int evenSum = 0, oddSum = 0;

        // Loop through numbers 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenSum += i;  // Adding even numbers
            } else {
                oddSum += i;  // Adding odd numbers
            }
        }

        // Displaying the sums
        System.out.println("Sum of even numbers from 1 to 100: " + evenSum);
        System.out.println("Sum of odd numbers from 1 to 100: " + oddSum);
    }
}
