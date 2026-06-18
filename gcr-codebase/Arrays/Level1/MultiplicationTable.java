import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer to generate its multiplication table: ");
        int number = input.nextInt();
        
        // Define an array to store results for 1 through 10
        int[] tableResults = new int[10];
        
        // Loop to calculate and store the results
        for (int i = 0; i < tableResults.length; i++) {
            tableResults[i] = number * (i + 1);
        }
        
        System.out.println("\n--- Multiplication Table for " + number + " ---");
        
        // Loop to display the array contents
        for (int i = 0; i < tableResults.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + tableResults[i]);
        }
        
        input.close();
    }
}