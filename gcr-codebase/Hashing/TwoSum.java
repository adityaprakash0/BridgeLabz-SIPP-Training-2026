import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] transactions, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < transactions.length; i++) {
            int complement = target - transactions[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(transactions[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] transactions = {10, 25, 15, 5, 20};
        int target = 30;

        int[] result = twoSum(transactions, target);

        System.out.println("Indices: " + result[0] + " " + result[1]);
    }
}
