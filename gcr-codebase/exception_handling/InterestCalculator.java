public class InterestCalculator {

    // Method declares it throws an exception (throws)
    // and explicitly triggers it if conditions are met (throw)
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive.");
        }
        // Simple interest formula: (P * R * T) / 100
        return (amount * rate * years) / 100.0;
    }

    public static void main(String[] args) {
        double principal = -5000.0; // Deliberately negative to test exception
        double rate = 5.5;
        int years = 3;

        try {
            double interest = calculateInterest(principal, rate, years);
            System.out.println("Calculated Interest: $" + interest);
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid input: " + e.getMessage());
        }
    }
}