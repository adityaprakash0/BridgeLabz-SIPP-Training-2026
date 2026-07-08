import java.util.Scanner;

public class BmiCalculator2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of persons in the team: ");
        int number = input.nextInt();
        
        if (number <= 0) {
            System.err.println("Invalid number of persons.");
            System.exit(0);
        }
        
        // 2D Array: Col 0 = Weight, Col 1 = Height, Col 2 = BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        
        for (int i = 0; i < personData.length; i++) {
            System.out.print("\nEnter weight for person " + (i + 1) + " (kg): ");
            double weight = input.nextDouble();
            System.out.print("Enter height for person " + (i + 1) + " (meters): ");
            double height = input.nextDouble();
            
            if (weight <= 0 || height <= 0) {
                System.err.println("Invalid input. Must be positive. Try again.");
                i--;
                continue;
            }
            
            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = weight / (height * height); // BMI
            
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        System.out.println("\n--- BMI Report (2D Data) ---");
        for (int i = 0; i < personData.length; i++) {
            System.out.println("Person " + (i + 1) + " | Height: " + personData[i][1] + "m | Weight: " + personData[i][0] + "kg | BMI: " + String.format("%.2f", personData[i][2]) + " | Status: " + weightStatus[i]);
        }
        
        input.close();
    }
}