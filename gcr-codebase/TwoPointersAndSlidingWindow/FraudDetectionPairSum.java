import java.util.Arrays;

public class FraudDetectionPairSum {
    
    public static int[] findPairSum(int[] transactions, int target) {
        int left = 0, right = transactions.length - 1;
        
        while (left < right) {
            int sum = transactions[left] + transactions[right];
            
            if (sum == target) {
                return new int[]{transactions[left], transactions[right]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        // Sorted array of daily transaction amounts
        int[] transactions = {10000, 25000, 30000, 39999, 45000};
        int target = 49999;
        
        int[] result = findPairSum(transactions, target);
        
        System.out.println("Target Structuring Amount: ₹" + target);
        System.out.println("Fraudulent Pair Found: " + Arrays.toString(result));
    }
}
