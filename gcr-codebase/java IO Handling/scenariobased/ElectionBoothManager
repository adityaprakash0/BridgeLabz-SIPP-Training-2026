package Scenario-Based;
import java.util.*;
public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] votes=new int[3]; // For 3 candidates
        String input;

        while (true) {
            System.out.print("Enter age (or 'exit' to quit): ");
            input=sc.next();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting. Final vote count:");
                for (int i=0; i<votes.length; i++) {
                    System.out.println("Candidate "+(i+1)+": "+votes[i]+" votes");
                }
                break;
            }

            int age=Integer.parseInt(input);
            if (age<18) {
                System.out.println("Not eligible to vote.");
                continue;
            }

            System.out.print("Enter candidate number (1-3): ");
            int candidate=sc.nextInt();
            if (candidate>=1 && candidate<=3) {
                votes[candidate-1]++;
                System.out.println("Vote recorded for Candidate "+candidate);
            } else {
                System.out.println("Invalid candidate number.");
            }
        }

        sc.close();
    }
}
