import java.util.Scanner;

public class Level1DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter distance in feet: ");
        double distFeet = input.nextDouble();
        
        double distYards = distFeet / 3.0;
        double distMiles = distYards / 1760.0;
        
        System.out.println("The distance in yards is " + distYards + " while the distance in miles is " + distMiles);
        input.close();
    }
}