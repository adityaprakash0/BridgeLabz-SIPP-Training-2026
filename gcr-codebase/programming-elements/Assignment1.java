import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        // Create a single Scanner object to use for all inputs
        Scanner input = new Scanner(System.in);

        // ==========================================
        // 1. Basic Calculator
        // ==========================================
        System.out.println("\n--- 1. Basic Calculator ---");
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


        // ==========================================
        // 2. Area of a Triangle
        // ==========================================
        System.out.println("\n--- 2. Area of a Triangle ---");
        double inchToCmConversion = 2.54;

        System.out.print("Enter triangle base in cm: ");
        double baseCm = input.nextDouble();

        System.out.print("Enter triangle height in cm: ");
        double heightCm = input.nextDouble();

        double areaCmSq = 0.5 * baseCm * heightCm;
        
        double baseInches = baseCm / inchToCmConversion;
        double heightInches = heightCm / inchToCmConversion;
        double areaInchesSq = 0.5 * baseInches * heightInches;

        System.out.println("The Area of the triangle in sq in is " + areaInchesSq + " and sq cm is " + areaCmSq);


        // ==========================================
        // 3. Side of a Square
        // ==========================================
        System.out.println("\n--- 3. Side of a Square ---");
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        double side = perimeter / 4.0;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);


        // ==========================================
        // 4. Distance Converter (Feet to Yards & Miles)
        // ==========================================
        System.out.println("\n--- 4. Distance Converter ---");
        double feetInYard = 3.0;
        double yardsInMile = 1760.0;

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double distanceInYards = distanceInFeet / feetInYard;
        double distanceInMiles = distanceInYards / yardsInMile;

        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);


        // ==========================================
        // 5. Total Purchase Price
        // ==========================================
        System.out.println("\n--- 5. Total Purchase Price ---");
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter the quantity to be bought: ");
        int quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);


        // ==========================================
        // 6. Quotient and Remainder
        // ==========================================
        System.out.println("\n--- 6. Quotient and Remainder ---");
        System.out.print("Enter first integer: ");
        int qNum1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int qNum2 = input.nextInt();

        int quotient = qNum1 / qNum2;
        int remainder = qNum1 % qNum2;

        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + qNum1 + " and " + qNum2);


        // ==========================================
        // 7. IntOperation 
        // ==========================================
        System.out.println("\n--- 7. Integer Operations ---");
        System.out.print("Enter integer value for a: ");
        int intA = input.nextInt();

        System.out.print("Enter integer value for b: ");
        int intB = input.nextInt();

        System.out.print("Enter integer value for c: ");
        int intC = input.nextInt();

        int intResult1 = intA + intB * intC;
        int intResult2 = intA * intB + intC;
        int intResult3 = intC + intA / intB;
        int intResult4 = intA % intB + intC;

        System.out.println("The results of Int Operations are " + intResult1 + ", " + intResult2 + ", " + intResult3 + ", and " + intResult4);


        // ==========================================
        // 8. DoubleOpt
        // ==========================================
        System.out.println("\n--- 8. Double Operations ---");
        System.out.print("Enter double value for a: ");
        double doubleA = input.nextDouble();

        System.out.print("Enter double value for b: ");
        double doubleB = input.nextDouble();

        System.out.print("Enter double value for c: ");
        double doubleC = input.nextDouble();

        double dResult1 = doubleA + doubleB * doubleC;
        double dResult2 = doubleA * doubleB + doubleC;
        double dResult3 = doubleC + doubleA / doubleB;
        double dResult4 = doubleA % doubleB + doubleC;

        System.out.println("The results of Double Operations are " + dResult1 + ", " + dResult2 + ", " + dResult3 + ", and " + dResult4);

        // Close the scanner at the very end of the program
        input.close();
        System.out.println("\n--- All assignments completed! ---");
    }
}