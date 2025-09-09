package JavaMethods.level3;

import java.util.Scanner;

public class MatrixOperations {

    // Generate a random matrix with given dimensions
    public static int[][] generateMatrix(int rows, int cols) {
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = (int)(Math.random() * 10); // values 0–9
        return mat;
    }

    // Add two matrices
    public static int[][] add(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                result[i][j] = a[i][j] + b[i][j];
        return result;
    }

    // Subtract two matrices
    public static int[][] subtract(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                result[i][j] = a[i][j] - b[i][j];
        return result;
    }

    // Multiply two matrices
    public static int[][] multiply(int[][] a, int[][] b) {
        int rowsA = a.length, colsA = a[0].length;
        int rowsB = b.length, colsB = b[0].length;

        if (colsA != rowsB) {
            throw new IllegalArgumentException("Matrix dimensions incompatible for multiplication.");
        }

        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++)
            for (int j = 0; j < colsB; j++)
                for (int k = 0; k < colsA; k++)
                    result[i][j] += a[i][k] * b[k][j];
        return result;
    }

    // Display a matrix
    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter rows and columns for Matrix A: ");
        int rowsA = sc.nextInt(), colsA = sc.nextInt();

        System.out.print("Enter rows and columns for Matrix B: ");
        int rowsB = sc.nextInt(), colsB = sc.nextInt();

        // Generate matrices
        int[][] matrixA = generateMatrix(rowsA, colsA);
        int[][] matrixB = generateMatrix(rowsB, colsB);

        System.out.println("\nMatrix A:");
        printMatrix(matrixA);

        System.out.println("\nMatrix B:");
        printMatrix(matrixB);

        // Addition and Subtraction (only if dimensions match)
        if (rowsA == rowsB && colsA == colsB) {
            System.out.println("\nMatrix A + B:");
            printMatrix(add(matrixA, matrixB));

            System.out.println("\nMatrix A - B:");
            printMatrix(subtract(matrixA, matrixB));
        } else {
            System.out.println("\nAddition/Subtraction not possible due to dimension mismatch.");
        }

        // Multiplication (only if colsA == rowsB)
        try {
            System.out.println("\nMatrix A × B:");
            printMatrix(multiply(matrixA, matrixB));
        } catch (IllegalArgumentException e) {
            System.out.println("\nMultiplication not possible: " + e.getMessage());
        }
    }
}