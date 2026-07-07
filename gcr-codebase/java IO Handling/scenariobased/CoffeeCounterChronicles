package Scenario-Based;
import java.util.*;
public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String coffeeType;
        double price=0, totalBill=0;

        while (true) {
            System.out.print("Enter coffee type (Espresso/Latte/Cappuccino) or 'exit' to quit: ");
            coffeeType=sc.next();

            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Exiting. Total bill for the day: "+totalBill);
                break;
            }

            switch (coffeeType.toLowerCase()) {
                case "espresso": price=3; break;
                case "latte": price=4; break;
                case "cappuccino": price=5; break;
                default:
                    System.out.println("Invalid coffee type. Try again.");
                    continue;
            }

            System.out.print("Enter quantity: ");
            int quantity=sc.nextInt();
            double bill=price*quantity;
            double gst=bill*0.18; // 18% GST
            totalBill+=bill+gst;

            System.out.println("Bill for this order: "+(bill+gst));
        }

        sc.close();
    }
}
