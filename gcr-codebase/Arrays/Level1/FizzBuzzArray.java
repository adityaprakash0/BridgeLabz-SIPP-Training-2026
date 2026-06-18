import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer for FizzBuzz: ");
        int number = input.nextInt();
        
        if (number <= 0) {
            System.err.println("Error: Must be a positive integer.");
            System.exit(0);
        }
        
        // Array size is number + 1 because we are looping from 0 to the number
        String[] fizzBuzzResults = new String[number + 1];
        
        // Populate the string array with FizzBuzz logic
        for (int i = 0; i <= number; i++) {
            if (i == 0) {
                fizzBuzzResults[i] = "0"; // 0 is technically divisible by everything, so we bypass it
            } else if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzResults[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                fizzBuzzResults[i] = "Fizz";
            } else if (i % 5 == 0) {
                fizzBuzzResults[i] = "Buzz";
            } else {
                fizzBuzzResults[i] = String.valueOf(i); // Convert the integer to string
            }
        }
        
        System.out.println("\n--- FizzBuzz Results ---");
        
        // Loop again to display the formatted results
        for (int i = 0; i < fizzBuzzResults.length; i++) {
            System.out.println("Position " + i + " = " + fizzBuzzResults[i]);
        }
        
        input.close();
    }
}