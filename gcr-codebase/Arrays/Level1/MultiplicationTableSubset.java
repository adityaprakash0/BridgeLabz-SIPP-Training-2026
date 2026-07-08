import java.util.Scanner;

public class MultiplicationTableSubset {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number to find its table from 6 to 9: ");
        int number = input.nextInt();
        
        // Array to store results for multipliers 6, 7, 8, 9 (size 4)
        int[] multiplicationResult = new int[4];
        
        // Loop from 6 to 9 and save in the array
        for (int i = 6; i <= 9; i++) {
            // i - 6 maps the multiplier (6-9) to array indices (0-3)
            multiplicationResult[i - 6] = number * i;
        }
        
        System.out.println("\n--- Multiplication Results (6 to 9) ---");
        
        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = i + 6;
            System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
        }
        
        input.close();
    }
}