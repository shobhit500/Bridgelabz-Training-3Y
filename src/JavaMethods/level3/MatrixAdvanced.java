package JavaMethods.level3;

import java.util.Scanner;

public class MatrixAdvanced {

    // Generate a random matrix
    public static double[][] generateMatrix(int rows, int cols) {
        double[][] mat = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = (int)(Math.random() * 10); // values 0–9
        return mat;
    }

    // Transpose of a matrix
    public static double[][] transpose(double[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        double[][] transposed = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transposed[j][i] = mat[i][j];
        return transposed;
    }

    // Determinant of 2x2 matrix
    public static double determinant2x2(double[][] mat) {
        return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
    }

    // Determinant of 3x3 matrix
    public static double determinant3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
                - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
                + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] mat) {
        double det = determinant2x2(mat);
        if (det == 0) throw new IllegalArgumentException("Matrix is singular");

        double[][] inv = new double[2][2];
        inv[0][0] = mat[1][1] / det;
        inv[0][1] = -mat[0][1] / det;
        inv[1][0] = -mat[1][0] / det;
        inv[1][1] = mat[0][0] / det;
        return inv;
    }

    // Inverse of 3x3 matrix using adjoint method
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) throw new IllegalArgumentException("Matrix is singular");

        double[][] adj = new double[3][3];

        adj[0][0] =  m[1][1]*m[2][2] - m[1][2]*m[2][1];
        adj[0][1] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        adj[0][2] =  m[1][0]*m[2][1] - m[1][1]*m[2][0];

        adj[1][0] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]);
        adj[1][1] =  m[0][0]*m[2][2] - m[0][2]*m[2][0];
        adj[1][2] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]);

        adj[2][0] =  m[0][1]*m[1][2] - m[0][2]*m[1][1];
        adj[2][1] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]);
        adj[2][2] =  m[0][0]*m[1][1] - m[0][1]*m[1][0];

        // Transpose adjoint and divide by determinant
        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inv[i][j] = adj[j][i] / det;

        return inv;
    }

    // Display matrix
    public static void printMatrix(double[][] mat) {
        for (double[] row : mat) {
            for (double val : row)
                System.out.printf("%.2f\t", val);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size (2 or 3): ");
        int size = sc.nextInt();

        if (size != 2 && size != 3) {
            System.out.println("Only 2x2 or 3x3 matrices supported.");
            return;
        }

        double[][] matrix = generateMatrix(size, size);
        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);

        System.out.println("\nTranspose:");
        printMatrix(transpose(matrix));

        if (size == 2) {
            double det = determinant2x2(matrix);
            System.out.println("\nDeterminant: " + det);
            if (det != 0) {
                System.out.println("\nInverse:");
                printMatrix(inverse2x2(matrix));
            } else {
                System.out.println("Matrix is singular, no inverse.");
            }
        } else {
            double det = determinant3x3(matrix);
            System.out.println("\nDeterminant: " + det);
            if (det != 0) {
                System.out.println("\nInverse:");
                printMatrix(inverse3x3(matrix));
            } else {
                System.out.println("Matrix is singular, no inverse.");
            }
        }
    }
}