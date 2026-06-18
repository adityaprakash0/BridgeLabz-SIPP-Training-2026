import java.util.Scanner;

// 1. Define the Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidator {

    // 2. Method that throws the custom exception
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("Access granted!");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        
        try {
            int age = input.nextInt();
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.err.println("Validation Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error: Invalid input.");
        } finally {
            input.close();
        }
    }
}