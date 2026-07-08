import java.util.Scanner;

public class FootballTeamMeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Array for 11 players
        double[] heights = new double[11];
        double sumOfHeights = 0.0;
        
        System.out.println("Enter the heights of the 11 players (in cm):");
        
        // Get user input and validate
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            double height = input.nextDouble();
            
            if (height <= 0) {
                System.err.println("Invalid height. Please enter a positive value.");
                i--; // Retry this iteration
            } else {
                heights[i] = height;
            }
        }
        
        // Calculate sum
        for (int i = 0; i < heights.length; i++) {
            sumOfHeights += heights[i];
        }
        
        // Calculate and print mean
        double meanHeight = sumOfHeights / heights.length;
        System.out.println("\nThe mean height of the football team is: " + meanHeight + " cm");
        
        input.close();
    }
}