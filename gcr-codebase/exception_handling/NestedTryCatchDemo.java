public class NestedTryCatchDemo {

    public static void processArrayElement(int[] numbers, int index, int divisor) {
        try {
            // Outer block handles array access
            int element = numbers[index];
            System.out.println("Element fetched successfully: " + element);
            
            try {
                // Inner block handles math
                int result = element / divisor;
                System.out.println("Division result: " + result);
            } catch (ArithmeticException e) {
                System.err.println("Error: Cannot divide by zero!");
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Invalid array index!");
        }
    }

    public static void main(String[] args) {
        int[] data = {100, 200, 300};
        
        System.out.println("Test 1: Valid operation");
        processArrayElement(data, 1, 10);
        
        System.out.println("\nTest 2: Division by zero");
        processArrayElement(data, 0, 0);
        
        System.out.println("\nTest 3: Array out of bounds");
        processArrayElement(data, 5, 2);
    }
}