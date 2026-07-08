import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number to reverse: ");
        int number = input.nextInt();
        int temp = Math.abs(number);
        
        // Find count of digits
        int count = 0;
        int countTemp = temp;
        while (countTemp > 0) {
            count++;
            countTemp /= 10;
        }
        
        // Save digits in array (Note: Modulo extracts them from last to first)
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        
        // Create reverse array
        int[] reverseArray = new int[count];
        for (int i = 0; i < count; i++) {
            // Place elements in reverse position
            reverseArray[i] = digits[count - 1 - i];
        }
        
        System.out.println("\n--- Reversed Array Elements ---");
        // Display in reverse order as requested
        for (int i = reverseArray.length - 1; i >= 0; i--) {
            System.out.print(reverseArray[i] + " ");
        }
        System.out.println();
        
        input.close();
    }
}