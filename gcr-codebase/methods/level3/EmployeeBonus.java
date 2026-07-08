public class EmployeeBonus {

    public static double[][] generateEmployeeData(int numberOfEmployees) {
        double[][] data = new double[numberOfEmployees][2];
        for (int i = 0; i < numberOfEmployees; i++) {
            // Salary between 10000 and 99999
            data[i][0] = (int) (Math.random() * 90000) + 10000;
            // Years of service between 1 and 15
            data[i][1] = (int) (Math.random() * 15) + 1;
        }
        return data;
    }

    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
        double[][] results = new double[employeeData.length][2]; // [Bonus, NewSalary]
        for (int i = 0; i < employeeData.length; i++) {
            double currentSalary = employeeData[i][0];
            double years = employeeData[i][1];
            
            double bonusPercentage = (years > 5) ? 0.05 : 0.02;
            double bonusAmount = currentSalary * bonusPercentage;
            
            results[i][0] = bonusAmount;
            results[i][1] = currentSalary + bonusAmount;
        }
        return results;
    }

    public static void displayReport(double[][] oldData, double[][] newData) {
        double sumOldSalary = 0, sumNewSalary = 0, totalBonus = 0;
        
        System.out.println("Emp\tOld Salary\tYears\tBonus Amt\tNew Salary");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < oldData.length; i++) {
            System.out.printf("%d\t%.2f\t%.0f\t%.2f\t\t%.2f\n", 
                (i+1), oldData[i][0], oldData[i][1], newData[i][0], newData[i][1]);
            
            sumOldSalary += oldData[i][0];
            totalBonus += newData[i][0];
            sumNewSalary += newData[i][1];
        }
        System.out.println("------------------------------------------------------------------");
        System.out.printf("TOTAL\t%.2f\t\t%.2f\t\t%.2f\n", sumOldSalary, totalBonus, sumNewSalary);
    }

    public static void main(String[] args) {
        int employeeCount = 10;
        double[][] oldData = generateEmployeeData(employeeCount);
        double[][] newData = calculateNewSalaryAndBonus(oldData);
        displayReport(oldData, newData);
    }
}
