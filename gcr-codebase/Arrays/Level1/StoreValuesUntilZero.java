import java.util.Scanner;

public class StoreValuesUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Array of size 10 to store values, total initialized to 0.0
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;
        
        System.out.println("Enter up to 10 numbers. Enter 0 or a negative number to stop.");
        
        // Infinite loop to take input
        while (true) {
            System.out.print("Enter number: ");
            double num = input.nextDouble();
            
            // Break conditions: 0, negative number, or array is full
            if (num <= 0 || index == values.length) {
                break;
            }
            
            values[index] = num;
            index++;
        }
        
        System.out.println("\n--- Stored Values ---");
        
        // Loop through only the elements we actually added
        for (int i = 0; i < index; i++) {
            System.out.println("Value " + (i + 1) + ": " + values[i]);
            total += values[i]; // Compute sum
        }
        
        System.out.println("Total Sum: " + total);
        
        input.close();
    }
}