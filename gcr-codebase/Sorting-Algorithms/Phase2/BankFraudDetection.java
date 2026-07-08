import java.util.Scanner;

public class BankFraudDetection {

    public static int mergeSortAndCount(int[] arr, int left, int right) {
        if (left >= right) return 0;
        
        int mid = left + (right - left) / 2;
        int count = mergeSortAndCount(arr, left, mid) + mergeSortAndCount(arr, mid + 1, right);
        
        // Counting step
        int j = mid + 1;
        for (int i = left; i <= mid; i++) {
            // Using 3L to prevent integer overflow when multiplying by 3
            while (j <= right && arr[i] > 3L * arr[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }
        
        // Standard Merge step
        merge(arr, left, mid, right);
        return count;
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];
        
        for (int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] transactions = new int[n];
        
        for (int i = 0; i < n; i++) {
            transactions[i] = sc.nextInt();
        }
        
        System.out.println(mergeSortAndCount(transactions, 0, n - 1));
        
        sc.close();
    }
}
