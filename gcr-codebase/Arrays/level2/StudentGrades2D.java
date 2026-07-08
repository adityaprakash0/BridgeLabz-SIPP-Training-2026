import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();
        
        // 2D Array: Rows = students, Cols = subjects (0: Phys, 1: Chem, 2: Math)
        int[][] marks = new int[numStudents][3];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];
        
        for (int i = 0; i < marks.length; i++) {
            System.out.println("\nStudent " + (i + 1) + " Marks (out of 100):");
            System.out.print("Physics: ");
            marks[i][0] = input.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = input.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = input.nextInt();
            
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.err.println("Invalid marks. Try again.");
                i--;
                continue;
            }
            
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            
            if (percentages[i] >= 80) grades[i] = 'A';
            else if (percentages[i] >= 60) grades[i] = 'B';
            else if (percentages[i] >= 40) grades[i] = 'C';
            else grades[i] = 'F';
        }
        
        System.out.println("\n--- Student Results (2D Array) ---");
        for (int i = 0; i < marks.length; i++) {
             System.out.println("Student " + (i + 1) + " | Physics: " + marks[i][0] + " | Chemistry: " + marks[i][1] + " | Maths: " + marks[i][2] + " | Percentage: " + String.format("%.1f", percentages[i]) + "% | Grade: " + grades[i]);
        }
        
        input.close();
    }
}