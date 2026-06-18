import java.util.Scanner;

public class ArrayOperationHandler {

    // Method to fetch the element
    public static void fetchElement(int[] numbers, int index) {
        try {
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Invalid index! Out of range.");
        } catch (NullPointerException e) {
            System.err.println("Error: Array is not initialized! (Null)");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Simulating the array data
        int[] validArray = {10, 20, 30, 40, 50};
        int[] nullArray = null;

        System.out.print("Enter index to retrieve from array: ");
        
        try {
            int index = input.nextInt();
            
            System.out.println("\nTesting with Valid Array:");
            fetchElement(validArray, index);
            
            System.out.println("\nTesting with Null Array:");
            fetchElement(nullArray, index);
            
        } catch (Exception e) {
            System.err.println("Invalid input type.");
        } finally {
            input.close();
        }
    }
}