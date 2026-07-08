import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer number: ");
        int number = input.nextInt();
        
        // Work with absolute value to handle negative inputs gracefully
        int temp = Math.abs(number);
        
        // 1. Define array size and index variable
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        // 2. Loop to extract digits and populate the array
        while (temp != 0) {
            if (index == maxDigit) {
                break; // Stop adding if array hits the max limit (per Hint f)
            }
            
            digits[index] = temp % 10; // Get last digit
            temp /= 10;                // Remove last digit
            index++;
        }
        
        // 3. Variables to track the largest and second largest
        int largest = -1;
        int secondLargest = -1;
        
        // 4. Loop through the extracted digits to find the largest values
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Old largest drops to second place
                largest = digits[i];     // New largest is set
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                // Catches values smaller than largest but bigger than current secondLargest
                secondLargest = digits[i];
            }
        }
        
        // 5. Display results
        System.out.println("\n--- Analysis of Number: " + number + " ---");
        System.out.println("Largest Digit: " + largest);
        
        // Handle edge case where all digits are the same (e.g., 555)
        if (secondLargest == -1) {
            System.out.println("Second Largest Digit: None (All digits are identical or missing)");
        } else {
            System.out.println("Second Largest Digit: " + secondLargest);
        }
        
        input.close();
    }
}