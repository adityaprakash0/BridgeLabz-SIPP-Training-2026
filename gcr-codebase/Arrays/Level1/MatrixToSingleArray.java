import java.util.Scanner;

public class MatrixToSingleArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();
        
        // Initialize the 2D array
        int[][] matrix = new int[rows][cols];
        
        System.out.println("Enter the elements of the " + rows + "x" + cols + " matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        
        // Initialize 1D array to hold all items
        int[] singleArray = new int[rows * cols];
        int index = 0;
        
        // Copy elements using nested loops
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                singleArray[index] = matrix[i][j];
                index++;
            }
        }
        
        System.out.println("\n--- 1D Array Result ---");
        for (int i = 0; i < singleArray.length; i++) {
            System.out.print(singleArray[i] + " ");
        }
        System.out.println();
        
        input.close();
    }
}