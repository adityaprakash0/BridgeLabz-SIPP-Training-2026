public class PeakElementFinder {

    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int n = arr.length;

        // Handle edge cases for array of size 1
        if (n == 1) return 0;
        
        // Check edges first to avoid out-of-bounds in the loop
        if (arr[0] > arr[1]) return 0;
        if (arr[n - 1] > arr[n - 2]) return n - 1;

        // Binary search for peak in the rest of the array
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is a peak
            if (mid > 0 && mid < n - 1 && arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid; // Return index of peak
            }
            
            // If the element to the left is greater, peak must be on the left
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            } 
            // Otherwise, peak must be on the right
            else {
                left = mid + 1;
            }
        }
        
        return -1; // Should not reach here for valid inputs
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 5, 6, 4};
        
        int peakIndex = findPeakElement(array);
        System.out.println("A peak element is at index: " + peakIndex + " (Value: " + array[peakIndex] + ")");
    }
}
