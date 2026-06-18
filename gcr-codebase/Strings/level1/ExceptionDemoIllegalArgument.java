import java.util.Scanner;

public class ExceptionDemoIllegalArgument {
    public static void generateException(String text) {
        // Start index greater than end index
        System.out.println(text.substring(5, 2)); 
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.err.println("Handled IllegalArgumentException: Start index cannot be greater than end index.");
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Handled IndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.err.println("Handled RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text (min 6 chars): ");
        String text = input.next();
        
        handleException(text);
        // generateException(text); // Uncomment to crash
        
        input.close();
    }
}