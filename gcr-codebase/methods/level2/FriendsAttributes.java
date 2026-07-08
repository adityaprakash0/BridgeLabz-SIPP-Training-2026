import java.util.Scanner;

public class FriendsAttributes {

    public static String findYoungest(int[] ages, String[] names) {
        int minAge = ages[0];
        String youngest = names[0];
        
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }
        return youngest;
    }

    public static String findTallest(double[] heights, String[] names) {
        double maxHeight = heights[0];
        String tallest = names[0];
        
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = names[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height for " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }

        String youngest = findYoungest(ages, names);
        String tallest = findTallest(heights, names);

        System.out.println("\nThe youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        sc.close();
    }
}
