import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double calcNum1 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        double calcNum2 = input.nextDouble();
        
        double addition = calcNum1 + calcNum2;
        double subtraction = calcNum1 - calcNum2;
        double multiplication = calcNum1 * calcNum2;
        double division = calcNum1 / calcNum2;
        
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " 
            + calcNum1 + " and " + calcNum2 + " is " 
            + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
            
        input.close();
    }
}