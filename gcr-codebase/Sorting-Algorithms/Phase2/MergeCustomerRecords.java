import java.util.Scanner;

public class MergeCustomerRecords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input for Branch A
        int n = sc.nextInt();
        int[] branchA = new int[n];
        for (int i = 0; i < n; i++) branchA[i] = sc.nextInt();
        
        // Input for Branch B
        int m = sc.nextInt();
        int[] branchB = new int[m];
        for (int i = 0; i < m; i++) branchB[i] = sc.nextInt();
        
        int[] result = new int[n + m];
        int i = 0, j = 0, k = 0;
        
        // Merge using two pointers
        while (i < n && j < m) {
            if (branchA[i] <= branchB[j]) {
                result[k++] = branchA[i++];
            } else {
                result[k++] = branchB[j++];
            }
        }
        
        while (i < n) result[k++] = branchA[i++];
        while (j < m) result[k++] = branchB[j++];
        
        // Print result
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
