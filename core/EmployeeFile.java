import java.io.*;
import java.util.Scanner;

public class EmployeeFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Taking employee details as input
        System.out.print("Enter Employee ID: ");
        String empId = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter DOB (yyyy-mm-dd): ");
        String dob = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();

        // Storing employee details in Emp.txt
        FileWriter writer = new FileWriter("Emp.txt");
        writer.write("Employee ID: " + empId + "\n");
        writer.write("Name: " + name + "\n");
        writer.write("Address: " + address + "\n");
        writer.write("DOB: " + dob + "\n");
        writer.write("Phone: " + phone + "\n");
        writer.close();

        // Displaying contents of Emp.txt
        System.out.println("\nContents of Emp.txt:");
        BufferedReader reader = new BufferedReader(new FileReader("Emp.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();

        scanner.close();
    }
}
