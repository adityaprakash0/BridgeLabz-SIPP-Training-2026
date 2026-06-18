import java.util.Scanner;

public class CustomStringLength {
    
    // Method to find length using an infinite loop and exception handling [cite: 209]
    public static int getCustomLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception caught means we reached the end of the string [cite: 209]
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.next(); // Taking single word input [cite: 207]
        
        int customLen = getCustomLength(text);
        int builtInLen = text.length();
        
        System.out.println("\n--- Length Results ---");
        System.out.println("Custom Length: " + customLen);
        System.out.println("Built-in Length: " + builtInLen);
        System.out.println("Match: " + (customLen == builtInLen));
        
        input.close();
    }
}