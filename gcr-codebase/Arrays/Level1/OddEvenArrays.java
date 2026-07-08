import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive Natural Number: ");
        int number = input.nextInt();
        
        // Validate natural number
        if (number < 1) {
            System.err.println("Error: Not a natural number.");
            System.exit(0);
        }
        
        // Initialize arrays based on max possible size
        int arraySize = (number / 2) + 1;
        int[] evens = new int[arraySize];
        int[] odds = new int[arraySize];
        
        int evenIndex = 0;
        int oddIndex = 0;
        
        // Iterate from 1 to the number to segregate odds and evens
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evens[evenIndex] = i;
                evenIndex++;
            } else {
                odds[oddIndex] = i;
                oddIndex++;
            }
        }
        
        // Print Evens
        System.out.print("\nEven numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evens[i] + " ");
        }
        
        // Print Odds
        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odds[i] + " ");
        }
        System.out.println();
        
        input.close();
    }
}