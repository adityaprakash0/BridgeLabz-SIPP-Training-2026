import java.util.Scanner;

public class NumberFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number to find its factors: ");
        int number = input.nextInt();
        
        if (number <= 0) {
            System.err.println("Please enter a positive integer.");
            System.exit(0);
        }
        
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        
        // Loop to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                
                // If array is full, double its size
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    
                    // Copy existing elements to temp array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp; // Reassign reference
                }
                
                factors[index] = i;
                index++;
            }
        }
        
        System.out.println("\n--- Factors of " + number + " ---");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
        
        input.close();
    }
}