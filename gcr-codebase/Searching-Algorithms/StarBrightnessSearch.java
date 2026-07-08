public class StarBrightnessSearch {

    // 1. Standard Binary Search O(log n)
    public static int standardSearch(int[] brightnessLevels, int target) {
        int left = 0;
        int right = brightnessLevels.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (brightnessLevels[mid] == target) {
                return mid;
            } else if (brightnessLevels[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // 2. Search in Rotated Catalog
    public static int searchInRotated(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return mid;

            // Check if left half is sorted
            if (arr[left] <= arr[mid]) {
                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } 
            // Otherwise, right half is sorted
            else {
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    // 3. Find First and Last Occurrence of a repeated value
    public static int[] findFirstAndLast(int[] arr, int target) {
        int[] result = {-1, -1};
        result[0] = findBound(arr, target, true);  // Find First
        result[1] = findBound(arr, target, false); // Find Last
        return result;
    }

    private static int findBound(int[] arr, int target, boolean isFirst) {
        int left = 0, right = arr.length - 1;
        int bound = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                bound = mid;
                if (isFirst) {
                    right = mid - 1; // Keep looking left
                } else {
                    left = mid + 1;  // Keep looking right
                }
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return bound;
    }

    // 4. Find Minimum Element in Rotated Catalog
    public static int findMinimum(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1; // Min must be to the right
            } else {
                right = mid; // Min could be mid or to the left
            }
        }
        return arr[left];
    }

    public static void main(String[] args) {
        // Simulating data
        int[] sortedCatalog = {100, 200, 300, 400, 400, 400, 500, 600};
        int[] rotatedCatalog = {400, 500, 600, 100, 200, 300, 400};

        System.out.println("Standard Search for 300: Index " + standardSearch(sortedCatalog, 300));
        System.out.println("Search in Rotated for 200: Index " + searchInRotated(rotatedCatalog, 200));
        
        int[] bounds = findFirstAndLast(sortedCatalog, 400);
        System.out.println("First and Last of 400: [" + bounds[0] + ", " + bounds[1] + "]");
        
        System.out.println("Minimum in rotated catalog: " + findMinimum(rotatedCatalog));
    }
}
