public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[5];
            numbers[10] = 30 / 0;  // This will throw two exceptions: ArrayIndexOutOfBoundsException and ArithmeticException
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("This block will always execute.");
        }
    }
}
