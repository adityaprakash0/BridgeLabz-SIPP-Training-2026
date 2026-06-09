public class ProfitLoss {
    public static void main(String[] args) {
        // Define the fixed cost price and selling price
        double costPrice = 129.0;
        double sellingPrice = 191.0;
        
        // Calculate the profit and profit percentage
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;
        
        // Display the results using a single print statement with a newline (\n)
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice 
            + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
    }
}