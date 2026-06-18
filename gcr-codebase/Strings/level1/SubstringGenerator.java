import java.util.Scanner;
public class SubstringGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the main string: ");
        String mainString = input.next();
        
        System.out.print("Enter the starting index: ");
        int startIndex = input.nextInt();
        
        System.out.print("Enter the ending index: ");
        int endIndex = input.nextInt();
        
        if (startIndex < 0 || endIndex > mainString.length() || startIndex >= endIndex) {
            System.err.println("Invalid indices!");
            return;
        }
        
        String substring = mainString.substring(startIndex, endIndex);
        System.out.println("Generated Substring: " + substring);
        
        input.close();
    }
}
