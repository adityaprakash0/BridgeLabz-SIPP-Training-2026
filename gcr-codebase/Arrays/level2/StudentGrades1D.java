import java.util.Scanner;

public class StudentGrades1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();
        
        int[] physics = new int[numStudents];
        int[] chemistry = new int[numStudents];
        int[] maths = new int[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + " Marks (out of 100):");
            System.out.print("Physics: ");
            int p = input.nextInt();
            System.out.print("Chemistry: ");
            int c = input.nextInt();
            System.out.print("Maths: ");
            int m = input.nextInt();
            
            if (p < 0 || c < 0 || m < 0 || p > 100 || c > 100 || m > 100) {
                System.err.println("Invalid marks. Must be between 0 and 100. Try again.");
                i--;
                continue;
            }
            
            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;
            
            percentages[i] = (p + c + m) / 3.0;
            
            if (percentages[i] >= 80) grades[i] = 'A';
            else if (percentages[i] >= 60) grades[i] = 'B';
            else if (percentages[i] >= 40) grades[i] = 'C';
            else grades[i] = 'F';
        }
        
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + " | Physics: " + physics[i] + " | Chemistry: " + chemistry[i] + " | Maths: " + maths[i] + " | Percentage: " + String.format("%.1f", percentages[i]) + "% | Grade: " + grades[i]);
        }
        
        input.close();
    }
}