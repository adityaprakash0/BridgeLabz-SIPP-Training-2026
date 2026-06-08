import java.util.Scanner;

public class Level1Assignments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ==========================================
        // 1. Harry's Age
        // ==========================================
        System.out.println("\n--- 1. Harry's Age ---");
        int birthYear = 2000;
        int currentYear = 2024;
        int harrysAge = currentYear - birthYear;
        System.out.println("Harry's age in 2024 is " + harrysAge);


        // ==========================================
        // 2. Sam's Average Marks
        // ==========================================
        System.out.println("\n--- 2. Sam's Average Marks ---");
        int mathsMark = 94;
        int physicsMark = 95;
        int chemistryMark = 96;
        double averageMark = (mathsMark + physicsMark + chemistryMark) / 3.0;
        System.out.println("Sam's average mark in PCM is " + averageMark);


        // ==========================================
        // 3. Kilometers to Miles (Fixed Value)
        // ==========================================
        System.out.println("\n--- 3. Kilometers to Miles (Fixed) ---");
        double distanceKm = 10.8;
        double kmToMilesConversion = 1.6; // using 1 mile = 1.6 km as per later hints
        double distanceMiles = distanceKm / kmToMilesConversion;
        System.out.println("The distance " + distanceKm + " km in miles is " + distanceMiles);


        // ==========================================
        // 4. Profit and Loss Calculation
        // ==========================================
        System.out.println("\n--- 4. Profit and Loss Calculation ---");
        double costPrice = 129.0;
        double sellingPrice = 191.0;
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice 
            + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);


        // ==========================================
        // 5. Divide Pens Equally
        // ==========================================
        System.out.println("\n--- 5. Divide Pens ---");
        int totalPens = 14;
        int students = 3;
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);


        // ==========================================
        // 6. University Discount (Fixed Value)
        // ==========================================
        System.out.println("\n--- 6. University Discount (Fixed) ---");
        double fee = 125000.0;
        double discountPercent = 10.0;
        double discountAmount = (discountPercent / 100.0) * fee;
        double finalFee = fee - discountAmount;
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);


        // ==========================================
        // 7. Volume of Earth
        // ==========================================
        System.out.println("\n--- 7. Volume of Earth ---");
        double radiusKm = 6378.0;
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double radiusMiles = radiusKm / 1.6; // Converting radius to miles first
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);


        // ==========================================
        // 8. Kilometers to Miles (User Input)
        // ==========================================
        System.out.println("\n--- 8. Kilometers to Miles (Input) ---");
        System.out.print("Enter distance in kilometers: ");
        double userKm = input.nextDouble();
        double userMiles = userKm / 1.6;
        System.out.println("The total miles is " + userMiles + " mile for the given " + userKm + " km");


        // ==========================================
        // 9. University Discount (User Input)
        // ==========================================
        System.out.println("\n--- 9. University Discount (Input) ---");
        System.out.print("Enter the course fee: ");
        double userFee = input.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double userDiscountPercent = input.nextDouble();
        double userDiscountAmount = (userDiscountPercent / 100.0) * userFee;
        double userFinalFee = userFee - userDiscountAmount;
        System.out.println("The discount amount is INR " + userDiscountAmount + " and final discounted fee is INR " + userFinalFee);


        // ==========================================
        // 10. Height in cm to feet and inches
        // ==========================================
        System.out.println("\n--- 10. Height Conversion ---");
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();
        double totalInches = heightCm / 2.54;
        int heightFeet = (int) (totalInches / 12);
        double heightRemainingInches = totalInches % 12;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + heightFeet + " and inches is " + heightRemainingInches);


        // ==========================================
        // 11. Basic Calculator
        // ==========================================
        System.out.println("\n--- 11. Basic Calculator ---");
        System.out.print("Enter first number: ");
        double calcNum1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double calcNum2 = input.nextDouble();
        double add = calcNum1 + calcNum2;
        double sub = calcNum1 - calcNum2;
        double mul = calcNum1 * calcNum2;
        double div = calcNum1 / calcNum2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
            + calcNum1 + " and " + calcNum2 + " is " 
            + add + ", " + sub + ", " + mul + ", and " + div);


        // ==========================================
        // 12. Area of a Triangle
        // ==========================================
        System.out.println("\n--- 12. Area of a Triangle ---");
        System.out.print("Enter triangle base: ");
        double tBase = input.nextDouble();
        System.out.print("Enter triangle height: ");
        double tHeight = input.nextDouble();
        double tArea = 0.5 * tBase * tHeight;
        System.out.println("The Area of the triangle is " + tArea);


        // ==========================================
        // 13. Side of a Square
        // ==========================================
        System.out.println("\n--- 13. Side of a Square ---");
        System.out.print("Enter perimeter of the square: ");
        double perimeter = input.nextDouble();
        double side = perimeter / 4.0;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);


        // ==========================================
        // 14. Feet to Yards and Miles
        // ==========================================
        System.out.println("\n--- 14. Distance Converter ---");
        System.out.print("Enter distance in feet: ");
        double distFeet = input.nextDouble();
        double distYards = distFeet / 3.0;
        double distMiles = distYards / 1760.0;
        System.out.println("The distance in yards is " + distYards + " while the distance in miles is " + distMiles);


        // ==========================================
        // 15. Total Purchase Price
        // ==========================================
        System.out.println("\n--- 15. Total Purchase Price ---");
        System.out.print("Enter unit price: ");
        double uPrice = input.nextDouble();
        System.out.print("Enter quantity: ");
        int uQty = input.nextInt();
        double totalP = uPrice * uQty;
        System.out.println("The total purchase price is INR " + totalP + " if the quantity " + uQty + " and unit price is INR " + uPrice);


        // ==========================================
        // 16. Maximum Handshakes
        // ==========================================
        System.out.println("\n--- 16. Maximum Handshakes ---");
        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();
        int handshakes = (numStudents * (numStudents - 1)) / 2;
        System.out.println("The maximum number of possible handshakes is " + handshakes);

        input.close();
        System.out.println("\n--- All Level 1 assignments completed! ---");
    }
}