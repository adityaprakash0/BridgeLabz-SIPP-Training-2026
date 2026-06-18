import java.util.Scanner;

public class BmiCalculator1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of persons in the team: ");
        int numPersons = input.nextInt();
        
        if (numPersons <= 0) {
            System.err.println("Invalid number of persons.");
            System.exit(0);
        }
        
        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons]; // in meters
        double[] bmis = new double[numPersons];
        String[] statuses = new String[numPersons];
        
        for (int i = 0; i < numPersons; i++) {
            System.out.print("\nEnter weight for person " + (i + 1) + " (kg): ");
            double weight = input.nextDouble();
            System.out.print("Enter height for person " + (i + 1) + " (meters): ");
            double height = input.nextDouble();
            
            if (weight <= 0 || height <= 0) {
                System.err.println("Invalid input. Must be positive. Try again.");
                i--;
                continue;
            }
            
            weights[i] = weight;
            heights[i] = height;
            
            // Calculate BMI: weight / (height * height)
            bmis[i] = weight / (height * height);
            
            // Determine Status
            if (bmis[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmis[i] < 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + " | Height: " + heights[i] + "m | Weight: " + weights[i] + "kg | BMI: " + String.format("%.2f", bmis[i]) + " | Status: " + statuses[i]);
        }
        
        input.close();
    }
}