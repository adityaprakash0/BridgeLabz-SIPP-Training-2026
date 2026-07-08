import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int qNum1 = input.nextInt();
        
        System.out.print("Enter second integer: ");
        int qNum2 = input.nextInt();
        
        int quotient = qNum1 / qNum2;
        int remainder = qNum1 % qNum2;
        
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + qNum1 + " and " + qNum2);
        
        input.close();
    }
}