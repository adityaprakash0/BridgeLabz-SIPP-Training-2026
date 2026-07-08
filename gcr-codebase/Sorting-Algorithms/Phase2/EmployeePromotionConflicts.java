import java.util.Scanner;

public class EmployeePromotionConflicts {

    public static long mergeAndCount(int[] arr, int left, int mid, int right) {
        int[] leftArr = new int[mid - left + 1];
        int[] rightArr = new int[right - mid];

        for (int i = 0; i < leftArr.length; i++) leftArr[i] = arr[left + i];
        for (int i = 0; i < rightArr.length; i++) rightArr[i] = arr[mid + 1 + i];

        int i = 0, j = 0, k = left;
        long swaps = 0;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] < rightArr[j]) {
                // If left is smaller, it forms a conflict with rightArr[j] and all elements after it
                swaps += (rightArr.length - j);
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        while (i < leftArr.length) arr[k++] = leftArr[i++];
        while (j < rightArr.length) arr[k++] = rightArr[j++];

        return swaps;
    }

    public static long mergeSortAndCount(int[] arr, int left, int right) {
        long count = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;
            count += mergeSortAndCount(arr, left, mid);
            count += mergeSortAndCount(arr, mid + 1, right);
            count += mergeAndCount(arr, left, mid, right);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        
        System.out.println(mergeSortAndCount(scores, 0, n - 1));
        sc.close();
    }
}
