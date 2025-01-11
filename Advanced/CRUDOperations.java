import java.sql.*;
import java.util.Scanner;

public class CRUDOperations {
    private static final String URL = "jdbc:mysql://localhost:3307/java-app-database";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            Scanner scanner = new Scanner(System.in);

            // Create Statement
            Statement statement = conn.createStatement();

            // CREATE - Insert Record
            System.out.println("Enter ID, Name, Age for new record:");
            int id = scanner.nextInt();
            String name = scanner.next();
            int age = scanner.nextInt();

            String insertSQL = "INSERT INTO Students (id, name, age) VALUES (?, ?, ?)";
            try (PreparedStatement insertStmt = conn.prepareStatement(insertSQL)) {
                insertStmt.setInt(1, id);
                insertStmt.setString(2, name);
                insertStmt.setInt(3, age);
                insertStmt.executeUpdate();
            }

            // READ - Select Records
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Students");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id") +
                        ", Name: " + resultSet.getString("name") +
                        ", Age: " + resultSet.getInt("age"));
            }

            // UPDATE - Update Record
            System.out.println("Enter ID to update:");
            int updateId = scanner.nextInt();
            System.out.println("Enter new Name and Age:");
            String updateName = scanner.next();
            int updateAge = scanner.nextInt();

            String updateSQL = "UPDATE Students SET name = ?, age = ? WHERE id = ?";
            try (PreparedStatement updateStmt = conn.prepareStatement(updateSQL)) {
                updateStmt.setString(1, updateName);
                updateStmt.setInt(2, updateAge);
                updateStmt.setInt(3, updateId);
                updateStmt.executeUpdate();
            }

            // DELETE - Delete Record
            System.out.println("Enter ID to delete:");
            int deleteId = scanner.nextInt();

            String deleteSQL = "DELETE FROM Students WHERE id = ?";
            try (PreparedStatement deleteStmt = conn.prepareStatement(deleteSQL)) {
                deleteStmt.setInt(1, deleteId);
                deleteStmt.executeUpdate();
            }

            scanner.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
