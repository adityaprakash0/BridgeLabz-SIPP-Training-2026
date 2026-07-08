public class FactorialCalculator {

    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        int result = calculateFactorial(number);
        
        System.out.println("Input:\n" + number);
        System.out.println("Output:\n" + result);
    }
}
