import java.util.Scanner;

public class YoungestTallestFriends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 1. Define arrays for names, ages, and heights
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[friends.length];
        double[] heights = new double[friends.length];
        
        // 2. Loop to gather user input
        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter age for " + friends[i] + ": ");
            ages[i] = input.nextInt();
            
            System.out.print("Enter height for " + friends[i] + " (in cm): ");
            heights[i] = input.nextDouble();
        }
        
        // 3. Initialize tracking variables with the first friend's data
        int youngestAge = ages[0];
        String youngestFriend = friends[0];
        
        double tallestHeight = heights[0];
        String tallestFriend = friends[0];
        
        // 4. Loop to compare and find the extremes
        for (int i = 1; i < friends.length; i++) { // Start at index 1 since we stored index 0
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = friends[i];
            }
            
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = friends[i];
            }
        }
        
        // 5. Display the findings
        System.out.println("\n--- Results ---");
        System.out.println("The youngest friend is " + youngestFriend + " (Age: " + youngestAge + ")");
        System.out.println("The tallest friend is " + tallestFriend + " (Height: " + tallestHeight + " cm)");
        
        input.close();
    }
}