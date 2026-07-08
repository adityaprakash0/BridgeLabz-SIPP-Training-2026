public class ExceptionPropagator {

    // Method 1 directly generates the exception
    public static void method1() {
        int riskyMath = 10 / 0; // Throws ArithmeticException
    }

    // Method 2 calls Method 1, ignoring the exception so it propagates
    public static void method2() {
        method1();
    }

    public static void main(String[] args) {
        System.out.println("Starting exception propagation chain...");
        try {
            method2();
        } catch (ArithmeticException e) {
            System.err.println("Handled exception in main: Caught an ArithmeticException from down the stack.");
        }
    }
}