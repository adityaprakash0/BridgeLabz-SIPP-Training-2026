import java.util.Scanner;

public class ExceptionDemoArrayIndex {
    public static void generateException(String[] names) {
        System.out.println(names[names.length + 1]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length + 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Handled ArrayIndexOutOfBoundsException: Tried to access an array index that doesn't exist.");
        } catch (RuntimeException e) {
            System.err.println("Handled RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[2];
        
        System.out.print("Enter name 1: ");
        names[0] = input.next();
        System.out.print("Enter name 2: ");
        names[1] = input.next();
        
        handleException(names);
        // generateException(names); // Uncomment to crash
        
        input.close();
    }
}