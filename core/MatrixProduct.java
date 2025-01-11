import java.util.Scanner;

public class MatrixProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the dimensions of the first matrix
        System.out.print("Enter the number of rows and columns of the first matrix: ");
        int m = scanner.nextInt(); // Rows of the first matrix
        int n = scanner.nextInt(); // Columns of the first matrix
        scanner.nextLine(); // Consume the newline character

        // Taking the dimensions of the second matrix
        System.out.print("Enter the number of rows and columns of the second matrix: ");
        int n2 = scanner.nextInt(); // Rows of the second matrix (must be equal to n)
        int p = scanner.nextInt();  // Columns of the second matrix
        scanner.nextLine(); // Consume the newline character

        // Check if matrix multiplication is possible
        if (n != n2) {
            System.out.println("Matrix multiplication is not possible with these dimensions.");
            return;
        }

        int[][] matrix1 = new int[m][n];
        int[][] matrix2 = new int[n2][p];
        int[][] result = new int[m][p];

        // Input for the first matrix 
        System.out.println("Enter elements of the first matrix :");
        String[] matrix1Elements = scanner.nextLine().split(" ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = Integer.parseInt(matrix1Elements[i * n + j]);
            }
        }

        // Input for the second matrix 
        System.out.println("Enter elements of the second matrix :");
        String[] matrix2Elements = scanner.nextLine().split(" ");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < p; j++) {
                matrix2[i][j] = Integer.parseInt(matrix2Elements[i * p + j]);
            }
        }

        // Perform matrix multiplication
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Print the resulting matrix
        System.out.println("The resulting matrix is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
