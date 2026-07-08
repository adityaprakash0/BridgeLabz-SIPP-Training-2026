package Scenario-Based;
import java.util.*;
public class BmiFitnessTracker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter height in meters: ");
        double height=sc.nextDouble();
        System.out.print("Enter weight in kg: ");
        double weight=sc.nextDouble();

        double bmi=weight/(height*height);
        String category;

        if (bmi<18.5) {
            category="Underweight";
        } else if (bmi<25) {
            category="Normal";
        } else {
            category="Overweight";
        }

        System.out.println("Your BMI: "+bmi);
        System.out.println("Category: "+category);
        sc.close();
    }
}
