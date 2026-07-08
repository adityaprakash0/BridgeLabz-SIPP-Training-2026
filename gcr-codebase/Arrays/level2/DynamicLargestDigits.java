import java.util.Scanner;

public class DynamicLargestDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer number: ");
        int number = input.nextInt();
        int temp = Math.abs(number);
        
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        // Loop to extract digits and dynamically resize array
        while (temp != 0) {
            // If the array is full, increase its size by 10
            if (index == maxDigit) {
                maxDigit += 10;
                int[] tempArray = new int[maxDigit];
                
                // Copy old elements to the new larger array
                for (int i = 0; i < digits.length; i++) {
                    tempArray[i] = digits[i];
                }
                digits = tempArray; // Reassign the reference
            }
            
            digits[index] = temp % 10;
            temp /= 10;
            index++;
        }
        
        int largest = -1;
        int secondLargest = -1;
        
        // Find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        
        System.out.println("\n--- Analysis of Number ---");
        System.out.println("Largest Digit: " + largest);
        if (secondLargest == -1) {
             System.out.println("Second Largest Digit: None");
        } else {
             System.out.println("Second Largest Digit: " + secondLargest);
        }
        
        input.close();
    }
}