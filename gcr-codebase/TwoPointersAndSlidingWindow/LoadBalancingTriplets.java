import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoadBalancingTriplets {
    
    public static List<List<Integer>> findTriplets(int[] jobs, int target) {
        Arrays.sort(jobs);
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < jobs.length - 2; i++) {
            // Skip duplicates for the anchor pointer
            if (i > 0 && jobs[i] == jobs[i - 1]) continue;
            
            int left = i + 1, right = jobs.length - 1;
            while (left < right) {
                int sum = jobs[i] + jobs[left] + jobs[right];
                
                if (sum == target) {
                    result.add(Arrays.asList(jobs[i], jobs[left], jobs[right]));
                    
                    // Skip duplicates for left and right pointers
                    while (left < right && jobs[left] == jobs[left + 1]) left++;
                    while (left < right && jobs[right] == jobs[right - 1]) right--;
                    
                    left++; 
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] jobDurations = {300, 200, 400, 300, 500, 100, 200};
        int maintenanceWindow = 900;
        
        List<List<Integer>> validTriplets = findTriplets(jobDurations, maintenanceWindow);
        
        System.out.println("Target Maintenance Window: " + maintenanceWindow + " ms");
        System.out.println("Valid Job Combinations (Triplets): " + validTriplets);
    }
}
