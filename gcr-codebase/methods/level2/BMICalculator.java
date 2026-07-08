import java.util.Scanner;

public class BMICalculator {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0; // Convert cm to meters
            double bmi = weight / (heightInMeters * heightInMeters);
            data[i][2] = bmi; 
        }
    }

    public static String[] getBMIStatusArray(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmi >= 25.0 && bmi <= 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int members = 10;
        double[][] teamData = new double[members][3]; // Col 0: Weight, Col 1: Height, Col 2: BMI

        for (int i = 0; i < members; i++) {
            System.out.print("Enter weight for member " + (i + 1) + " (kg): ");
            teamData[i][0] = sc.nextDouble();
            System.out.print("Enter height for member " + (i + 1) + " (cm): ");
            teamData[i][1] = sc.nextDouble();
        }

        calculateBMI(teamData);
        String[] statuses = getBMIStatusArray(teamData);

        System.out.println("\n--- Team BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s %-15s\n", "Member", "Weight(kg)", "Height(cm)", "BMI", "Status");
        
        for (int i = 0; i < members; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-15.2f %-15s\n", 
                    (i + 1), teamData[i][0], teamData[i][1], teamData[i][2], statuses[i]);
        }
        
        sc.close();
    }
}
