public class SumNaturalNumbers {

    public static int calculateSum(int n) {
        if (n == 0) {
            return 0;
        }
        
        return n + calculateSum(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int sum = calculateSum(n);
        
        System.out.println("Input:\nN = " + n);
        System.out.println("Output:\n" + sum);
    }
}
