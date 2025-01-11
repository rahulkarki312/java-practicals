import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the dimensions of the matrices
        System.out.print("Enter the number of rows and columns: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];

        // Inputting the elements of the first matrix
        System.out.println("Enter the elements of the first matrix :");
        String[] matrix1Elements = scanner.nextLine().split(" ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = Integer.parseInt(matrix1Elements[i * cols + j]);
            }
        }

        // Inputting the elements of the second matrix
        System.out.println("Enter the elements of the second matrix :");
        String[] matrix2Elements = scanner.nextLine().split(" ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = Integer.parseInt(matrix2Elements[i * cols + j]);
            }
        }

        // Calculating the sum of the two matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Displaying the sum of the matrices
        System.out.println("Sum of the matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
