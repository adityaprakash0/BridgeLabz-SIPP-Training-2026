public class SortedMatrixSearch {

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Treat the 2D matrix as a flattened 1D array
        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Map 1D index back to 2D row and column
            int midValue = matrix[mid / cols][mid % cols];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1,   3,  5,  7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 3;

        boolean found = searchMatrix(matrix, target);
        System.out.println("Is target " + target + " in the matrix? " + found);
        
        System.out.println("Is target 13 in the matrix? " + searchMatrix(matrix, 13));
    }
}
