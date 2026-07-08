import java.util.Scanner;

public class QuickSortAssignment {

    // Main Quick Sort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // pi is the partitioning index, arr[pi] is now at right place
            int pi = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Lomuto Partition function
    public static int partition(int[] arr, int low, int high) {
        // Choose the last element as the pivot
        int pivot = arr[high];
        
        // Index of smaller element
        int i = (low - 1); 
        
        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read N (Number of flight ticket prices)
        int n = sc.nextInt();
        int[] prices = new int[n];
        
        // Read prices
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        
        // Call Quick Sort
        quickSort(prices, 0, n - 1);
        
        // Print sorted prices
        for (int i = 0; i < n; i++) {
            System.out.print(prices[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
