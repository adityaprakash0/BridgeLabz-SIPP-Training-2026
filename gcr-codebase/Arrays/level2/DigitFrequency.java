import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer number: ");
        int number = input.nextInt();
        int temp = Math.abs(number);
        
        // Handle the edge case where the user inputs 0 directly
        if (temp == 0) {
            System.out.println("Frequency of 0: 1");
            System.exit(0);
        }
        
        int count = 0;
        int countTemp = temp;
        while (countTemp > 0) {
            count++;
            countTemp /= 10;
        }
        
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        
        // Frequency array: index corresponds to the digit (0-9)
        int[] frequency = new int[10];
        
        // Loop through the extracted digits and increment the corresponding frequency index
        for (int i = 0; i < digits.length; i++) {
            int currentDigit = digits[i];
            frequency[currentDigit]++; 
        }
        
        System.out.println("\n--- Digit Frequencies ---");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " time(s)");
            }
        }
        
        input.close();
    }
}