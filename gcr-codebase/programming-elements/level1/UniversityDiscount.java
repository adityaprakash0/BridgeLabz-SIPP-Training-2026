public class UniversityDiscount {
    public static void main(String[] args) {
        // Define the fixed fee and discount percentage
        double fee = 125000.0;
        double discountPercent = 10.0;
        
        // Calculate the discount amount
        double discountAmount = (discountPercent / 100.0) * fee;
        
        // Calculate the final discounted fee
        double finalFee = fee - discountAmount;
        
        // Display the results
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
    }
}