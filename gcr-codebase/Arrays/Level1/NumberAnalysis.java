import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        // 1. Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // 2. Define variables to avoid hardcoding
        int totalNumbers = 5;
        int[] numbers = new int[totalNumbers];

        System.out.println("Enter " + totalNumbers + " integers:");

        // 3. Loop to take user input and populate the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            // Assuming the user enters valid integers here, 
            // but we could add try-catch blocks for stricter validation later!
            numbers[i] = input.nextInt();
        }

        System.out.println("\n--- Number Analysis Results ---");

        // 4. Loop through array to check positive/negative/zero and even/odd
        for (int i = 0; i < numbers.length; i++) {
            int currentNum = numbers[i];

            if (currentNum > 0) {
                System.out.print("Number " + currentNum + " is positive ");
                // Nested if to check for even/odd
                if (currentNum % 2 == 0) {
                    System.out.println("and EVEN.");
                } else {
                    System.out.println("and ODD.");
                }
            } else if (currentNum < 0) {
                System.out.println("Number " + currentNum + " is negative.");
            } else {
                System.out.println("Number " + currentNum + " is zero.");
            }
        }

        System.out.println("\n--- Comparing First and Last Elements ---");

        // 5. Compare the first and last element of the array
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1]; // Avoids hardcoding index 4

        if (firstElement == lastElement) {
            System.out.println("First element (" + firstElement + ") is EQUAL to the last element (" + lastElement + ").");
        } else if (firstElement > lastElement) {
            System.out.println("First element (" + firstElement + ") is GREATER than the last element (" + lastElement + ").");
        } else {
            System.out.println("First element (" + firstElement + ") is LESS than the last element (" + lastElement + ").");
        }

        // 6. Close scanner
        input.close();
    }
}