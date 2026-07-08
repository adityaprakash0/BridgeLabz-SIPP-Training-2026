import java.util.Arrays;

public class FirstAndLastOccurrence {

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = findFirst(nums, target);
        if (result[0] != -1) { // Only look for last if first was found
            result[1] = findLast(nums, target);
        }
        return result;
    }

    private static int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1; // Move left to find earlier occurrences
            } else {
                left = mid + 1;
            }
            if (nums[mid] == target) index = mid;
        }
        return index;
    }

    private static int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1; // Move right to find later occurrences
            } else {
                right = mid - 1;
            }
            if (nums[mid] == target) index = mid;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {5, 7, 7, 8, 8, 10};
        int target = 8;
        
        int[] range = searchRange(array, target);
        System.out.println("First and last occurrence of " + target + " is at indices: " + Arrays.toString(range));
    }
}
