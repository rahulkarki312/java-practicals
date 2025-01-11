import java.rmi.Naming;
import java.util.Scanner;

public class RMIClient {
    public static void main(String[] args) {
        try {
            
            Calculator calculator = (Calculator) Naming.lookup("rmi://localhost:1098/CalculatorService");

            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            int sum = calculator.sum(num1, num2);
            int difference = calculator.difference(num1, num2);

            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);

            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
