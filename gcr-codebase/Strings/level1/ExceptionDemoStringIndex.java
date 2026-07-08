import java.util.Scanner;

public class ExceptionDemoStringIndex {
    public static void generateException(String text) {
        // Accessing beyond length
        System.out.println(text.charAt(text.length() + 1)); 
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Handled StringIndexOutOfBoundsException: Index is larger than string length.");
        } catch (RuntimeException e) {
            System.err.println("Handled RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.next();
        
        System.out.println("--- Handling Exception ---");
        handleException(text);
        
        // System.out.println("\n--- Generating Exception ---");
        // generateException(text); // Uncomment to crash program
        
        input.close();
    }
}