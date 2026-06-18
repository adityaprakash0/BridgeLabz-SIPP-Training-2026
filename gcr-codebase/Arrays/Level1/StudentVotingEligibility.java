import java.util.Scanner;

public class StudentVotingEligibility {
    public static void main(String[] args) {
        // 1. Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // 2. Define variables to avoid hardcoding
        int totalStudents = 10;
        int[] studentAges = new int[totalStudents];

        System.out.println("Enter the ages of " + totalStudents + " students:");

        // 3. Loop to take user input and populate the array
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age for Student " + (i + 1) + ": ");
            int age = input.nextInt();

            // 4. Validate the user input (Best Practice Check)
            if (age < 0) {
                System.err.println("Invalid age. Age cannot be negative. Please enter again.");
                i--; // Decrement index so the loop repeats for this specific student
            } else {
                studentAges[i] = age; // Save to array if valid
            }
        }

        System.out.println("\n--- Voting Eligibility Results ---");

        // 5. Loop through the array using the length property to check eligibility
        for (int i = 0; i < studentAges.length; i++) {
            if (studentAges[i] >= 18) {
                System.out.println("The student with the age " + studentAges[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + studentAges[i] + " cannot vote.");
            }
        }

        // 6. Close the scanner to prevent resource leaks
        input.close();
    }
}