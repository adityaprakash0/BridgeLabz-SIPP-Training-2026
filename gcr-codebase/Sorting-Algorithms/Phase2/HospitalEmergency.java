import java.util.Scanner;

public class HospitalEmergency {

    public static int quickSelect(int[] arr, int left, int right, int k) {
        if (left == right) return arr[left];

        int pivotIndex = partition(arr, left, right);
        
        // If pivot is exactly the k-th highest element
        if (k == pivotIndex) {
            return arr[k];
        } else if (k < pivotIndex) {
            return quickSelect(arr, left, pivotIndex - 1, k);
        } else {
            return quickSelect(arr, pivotIndex + 1, right, k);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left;
        
        // Partitioning for descending order
        for (int j = left; j < right; j++) {
            if (arr[j] >= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, right);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] priorities = new int[n];
        
        for (int i = 0; i < n; i++) {
            priorities[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        
        // k-th highest means index k-1 in a 0-indexed descending array
        int result = quickSelect(priorities, 0, n - 1, k - 1);
        System.out.println(result);
        
        sc.close();
    }
}
