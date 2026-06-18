public class StudentVotingRandomizer {

    // Generate random ages [cite: 275]
    public static int[] generateRandomAges(int numberOfStudents) {
        int[] ages = new int[numberOfStudents];
        for (int i = 0; i < ages.length; i++) {
            // Generating age between 10 and 30 for realistic testing
            ages[i] = 10 + (int)(Math.random() * 21); 
        }
        return ages; [cite: 275]
    }

    // Return 2D array of age and voting status [cite: 276]
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                results[i][1] = "false (Invalid)"; [cite: 277]
            } else if (ages[i] >= 18) {
                results[i][1] = "true"; [cite: 278]
            } else {
                results[i][1] = "false";
            }
        }
        return results;
    }

    // Display tabular format [cite: 279]
    public static void displayVotingTable(String[][] data) {
        System.out.println("\n--- Voting Eligibility ---");
        System.out.printf("%-10s | %-15s%n", "Age", "Can Vote?");
        System.out.println("---------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s | %-15s%n", data[i][0], data[i][1]);
        }
    }

    public static void main(String[] args) {
        int[] studentAges = generateRandomAges(10); [cite: 280]
        String[][] votingData = checkVotingEligibility(studentAges);
        displayVotingTable(votingData); [cite: 280]
    }
}