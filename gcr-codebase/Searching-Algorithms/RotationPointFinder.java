public class RotationPointFinder {

    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // If array is not rotated at all
        if (arr[left] <= arr[right]) {
            return arr[left];
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than the rightmost element, 
            // the smallest element must be to the right.
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } 
            // Otherwise, the smallest element is at mid or to the left.
            else {
                right = mid;
            }
        }
        
        // Loop ends when left == right, pointing to the smallest element
        return arr[left];
    }

    public static void main(String[] args) {
        int[] rotatedArray = {15, 18, 2, 3, 6, 12};
        
        int rotationPointValue = findRotationPoint(rotatedArray);
        System.out.println("The rotation point (smallest element) is: " + rotationPointValue);
    }
}
