public class StudentGradesRandomizer {

    // Generate random 2-digit scores [cite: 302]
    public static int[][] generateRandomScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 30 + (int)(Math.random() * 71); // Physics (30-100)
            scores[i][1] = 30 + (int)(Math.random() * 71); // Chemistry
            scores[i][2] = 30 + (int)(Math.random() * 71); // Maths
        }
        return scores; [cite: 303]
    }

    // Calculate total, average, and percentage [cite: 304]
    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100.0;
            
            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0; [cite: 305]
            stats[i][2] = Math.round(percentage * 100.0) / 100.0; [cite: 305]
        }
        return stats;
    }

    // Calculate Grade [cite: 306]
    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double percentage = stats[i][2];
            if (percentage >= 80) grades[i] = "A"; [cite: 300]
            else if (percentage >= 70) grades[i] = "B"; [cite: 300]
            else if (percentage >= 60) grades[i] = "C"; [cite: 300]
            else if (percentage >= 50) grades[i] = "D"; [cite: 300]
            else if (percentage >= 40) grades[i] = "E"; [cite: 300]
            else grades[i] = "R"; [cite: 300]
        }
        return grades; [cite: 306]
    }

    // Display Scorecard [cite: 307]
    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("\n--- Final Student Scorecard ---");
        System.out.printf("%-10s | %-5s | %-5s | %-5s | %-7s | %-8s | %-10s | %-5s%n", 
                          "Student", "Phy", "Chem", "Math", "Total", "Average", "Percentage", "Grade");
        System.out.println("-------------------------------------------------------------------------");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("Student %-2d | %-5d | %-5d | %-5d | %-7.0f | %-8.2f | %-9.2f%% | %-5s%n", 
                              (i + 1), scores[i][0], scores[i][1], scores[i][2], 
                              stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 5; // Configurable number of students
        int[][] scores = generateRandomScores(numStudents);
        double[][] stats = calculateStats(scores);
        String[] grades = calculateGrades(stats);
        
        displayScorecard(scores, stats, grades);
    }
}