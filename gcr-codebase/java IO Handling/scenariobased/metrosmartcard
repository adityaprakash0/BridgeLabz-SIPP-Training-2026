package Scenario-Based;
import java.util.*;
public class MetroSmartCardFareDeduction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double balance=100.0; 
        String choice;
        do {
            System.out.print("Enter distance to travel (in km): ");
            double distance=sc.nextDouble();
            double fare=(distance<=5)?10:(distance<=15)?20:30;

            if (fare>balance) {
                System.out.println("Insufficient balance. Please recharge your card.");
                break;
            }

            balance-=fare;
            System.out.println("Fare deducted: "+fare);
            System.out.println("Remaining balance: "+balance);

            if (balance<=0){
                System.out.println("Balance exhausted. Please recharge your card.");
                break;
            }

            System.out.print("Do you want to continue? (yes/no): ");
            choice=sc.next();
        } while (choice.equalsIgnoreCase("yes"));

        sc.close();
    }
}
