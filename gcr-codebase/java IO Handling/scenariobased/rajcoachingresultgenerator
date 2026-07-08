package Scenario-Based;
import java.util.*;
public class RajCoachingResultGenerator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double total=0;
        int subjects=5;

        for (int i=1; i<=subjects; i++) {
            System.out.print("Enter marks for subject "+i+": ");
            total+=sc.nextDouble();
        }

        double average=total/subjects;
        String grade;

        switch ((int)average/10) {
            case 10:
            case 9: grade="A+"; break;
            case 8: grade="A"; break;
            case 7: grade="B"; break;
            case 6: grade="C"; break;
            default: grade="F";
        }

        System.out.println("Average Marks: "+average);
        System.out.println("Grade: "+grade);
        sc.close();
    }
}
