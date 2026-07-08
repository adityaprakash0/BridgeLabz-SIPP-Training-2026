import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionHandler {

    // Method to perform division and handle ArithmeticException
    public static void performDivision(int numerator, int denominator) {
        try {
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: Cannot divide by zero!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- Division Calculator ---");

        try {
            System.out.print("Enter the numerator: ");
            int numerator = input.nextInt();
            
            System.out.print("Enter the denominator: ");
            int denominator = input.nextInt();

            performDivision(numerator, denominator);

        } catch (InputMismatchException e) {
            System.err.println("Error: Invalid input. Please enter numeric integer values only.");
        } finally {
            input.close();
        }
    }
}