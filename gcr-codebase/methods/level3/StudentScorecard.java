import java.util.Scanner;

public class StudentScorecard {

    public static int[][] generateScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 90) + 10; // Random 10-99
            }
        }
        return scores;
    }

    // Returns array where Col 0: Total, Col 1: Average, Col 2: Percentage
    public static double[][] calculateMetrics(int[][] scores) {
        double[][] metrics = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            
            metrics[i][0] = total;
            metrics[i][1] = Math.round(average * 100.0) / 100.0;
            metrics[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return metrics;
    }

    public static void displayScorecard(int[][] scores, double[][] metrics) {
        System.out.println("Std\tPhy\tChe\tMat\tTotal\tAvg\tPerc(%)");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f\n", 
                (i+1), scores[i][0], scores[i][1], scores[i][2], 
                metrics[i][0], metrics[i][1], metrics[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int count = sc.nextInt();

        int[][] scores = generateScores(count);
        double[][] metrics = calculateMetrics(scores);
        displayScorecard(scores, metrics);
        
        sc.close();
    }
}
