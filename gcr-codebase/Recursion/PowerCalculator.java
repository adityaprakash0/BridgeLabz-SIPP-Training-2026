public class PowerCalculator {

    public static int calculatePower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        
        return x * calculatePower(x, n - 1);
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int result = calculatePower(x, n);
        
        System.out.println("Input:\nx = " + x + "\nn = " + n);
        System.out.println("Output:\n" + result);
    }
}
