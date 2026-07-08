public class ExceptionDemoNullPointer {
    // Method to generate the exception
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // Will throw exception
    }

    // Method to handle the exception
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.err.println("Handled NullPointerException: Attempted to call a method on a null object reference.");
        } catch (RuntimeException e) {
            System.err.println("Handled RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Handling Exception ---");
        handleException();
        
        System.out.println("\n--- Generating Exception ---");
        // Uncomment the line below to see the program abruptly stop
        // generateException(); 
    }
}