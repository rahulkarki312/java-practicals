import java.io.*;
import java.util.Scanner;

public class StudentFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Taking student details as input
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Grade: ");
        String grade = scanner.nextLine();
        System.out.print("Enter Contact Number: ");
        String contact = scanner.nextLine();

        // Writing student details to std.txt
        FileWriter writer = new FileWriter("std.txt");
        writer.write("Name: " + name + "\n");
        writer.write("Age: " + age + "\n");
        writer.write("Grade: " + grade + "\n");
        writer.write("Contact: " + contact + "\n");
        writer.close();

        // Copying contents of std.txt to std1.txt
        BufferedReader reader = new BufferedReader(new FileReader("std.txt"));
        FileWriter writerCopy = new FileWriter("std1.txt");
        String line;
        while ((line = reader.readLine()) != null) {
            writerCopy.write(line + "\n");
        }
        reader.close();
        writerCopy.close();

        // Displaying the contents of std1.txt
        System.out.println("\nContents of std1.txt:");
        BufferedReader readerCopy = new BufferedReader(new FileReader("std1.txt"));
        while ((line = readerCopy.readLine()) != null) {
            System.out.println(line);
        }
        readerCopy.close();

        scanner.close();
    }
}
