import java.util.HashMap;
import java.util.Map;

public class ApiRateLimiterWindow {
    
    public static int longestSubarrayWithAtMostNDistinct(int[] keyIds, int n) {
        Map<Integer, Integer> freq = new HashMap<>();
        int start = 0, maxLen = 0;
        
        for (int end = 0; end < keyIds.length; end++) {
            freq.merge(keyIds[end], 1, Integer::sum);
            
            // Shrink window if we have more than 'n' distinct keys
            while (freq.size() > n) {
                int leftKey = keyIds[start];
                freq.put(leftKey, freq.get(leftKey) - 1);
                
                if (freq.get(leftKey) == 0) {
                    freq.remove(leftKey);
                }
                start++;
            }
            // Update the maximum window length found so far
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] apiKeys = {101, 102, 101, 103, 104, 101, 101, 102};
        int n = 2; // At most 2 distinct keys active
        
        int maxWindowLength = longestSubarrayWithAtMostNDistinct(apiKeys, n);
        
        System.out.println("API Key Request Stream: [101, 102, 101, 103, 104, 101, 101, 102]");
        System.out.println("Longest contiguous sequence using at most " + n + " distinct keys: " + maxWindowLength);
    }
}
