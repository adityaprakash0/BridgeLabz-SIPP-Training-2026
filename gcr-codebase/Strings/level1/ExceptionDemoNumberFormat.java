import java.util.Scanner;

public class ExceptionDemoNumberFormat {
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Extracted number: " + number);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Extracted number: " + number);
        } catch (NumberFormatException e) {
            System.err.println("Handled NumberFormatException: The text does not contain a valid integer.");
        } catch (RuntimeException e) {
            System.err.println("Handled RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text that is NOT a number (e.g., 'hello'): ");
        String text = input.next();
        
        handleException(text);
        // generateException(text); // Uncomment to crash
        
        input.close();
    }
}