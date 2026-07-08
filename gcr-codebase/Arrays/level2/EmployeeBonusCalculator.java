import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 1. Define array size and parallel arrays for employee data
        int numEmployees = 10;
        double[] salaries = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] bonuses = new double[numEmployees];
        double[] newSalaries = new double[numEmployees];
        
        // Variables for company totals
        double totalOldSalary = 0.0;
        double totalBonus = 0.0;
        double totalNewSalary = 0.0;
        
        System.out.println("Enter data for " + numEmployees + " employees:");

        // 2. Loop to take and validate inputs
        for (int i = 0; i < salaries.length; i++) {
            System.out.print("Employee " + (i + 1) + " Salary: ");
            double salary = input.nextDouble();
            
            System.out.print("Employee " + (i + 1) + " Years of Service: ");
            double years = input.nextDouble();
            
            // Validation check
            if (salary <= 0 || years < 0) {
                System.err.println("Invalid input. Salary must be > 0 and years >= 0. Try again.");
                i--; // Decrement index to repeat this employee
            } else {
                salaries[i] = salary;
                yearsOfService[i] = years;
            }
        }

        // 3. Loop to compute bonuses and totals
        for (int i = 0; i < salaries.length; i++) {
            // 5% bonus for > 5 years, otherwise 2%
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }
            
            newSalaries[i] = salaries[i] + bonuses[i];
            
            // Accumulate totals
            totalOldSalary += salaries[i];
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }

        // 4. Display the results
        System.out.println("\n--- Zara Company Payout Summary ---");
        System.out.println("Total Old Salary Payout: $" + totalOldSalary);
        System.out.println("Total Bonus Payout: $" + totalBonus);
        System.out.println("Total New Salary Payout: $" + totalNewSalary);

        input.close();
    }
}