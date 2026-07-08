import java.util.Scanner;

public class StudentVoteChecker {

    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();
        int totalStudents = 10;
        int[] ages = new int[totalStudents];

        for (int i = 0; i < totalStudents; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        System.out.println("\n--- Voting Eligibility Results ---");
        for (int i = 0; i < totalStudents; i++) {
            boolean isEligible = checker.canStudentVote(ages[i]);
            System.out.println("Student " + (i + 1) + " (Age " + ages[i] + "): " + 
                               (isEligible ? "Can Vote" : "Cannot Vote"));
        }
        sc.close();
    }
}
