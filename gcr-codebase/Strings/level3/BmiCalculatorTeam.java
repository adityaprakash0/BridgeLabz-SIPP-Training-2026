import java.util.Scanner;

public class BmiCalculatorTeam {

    // Calculate BMI and Status
    public static String[][] calculateBmiAndStatus(double[][] personData) {
        String[][] results = new String[personData.length][4];
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double heightCm = personData[i][1];
            double heightM = heightCm / 100.0;
            
            double bmi = weight / (heightM * heightM);
            String status;
            
            if (bmi <= 18.4) status = "Underweight";
            else if (bmi <= 24.9) status = "Normal";
            else if (bmi <= 39.9) status = "Overweight";
            else status = "Obese";
            
            results[i][0] = String.format("%.1f", heightCm);
            results[i][1] = String.format("%.1f", weight);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
        }
        return results;
    }

    // Display in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s | %-10s | %-10s | %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s | %-10s | %-10s | %-15s%n", data[i][0], data[i][1], data[i][2], data[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int teamSize = 10;
        double[][] personData = new double[teamSize][2];
        
        System.out.println("Enter weight(kg) and height(cm) for " + teamSize + " members:");
        for (int i = 0; i < teamSize; i++) {
            System.out.print("Member " + (i + 1) + " Weight: ");
            personData[i][0] = input.nextDouble();
            System.out.print("Member " + (i + 1) + " Height: ");
            personData[i][1] = input.nextDouble();
        }
        
        String[][] bmiData = calculateBmiAndStatus(personData);
        displayTable(bmiData);
        input.close();
    }
}