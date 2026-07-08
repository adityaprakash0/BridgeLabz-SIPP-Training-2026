import java.util.Scanner;

public class FactorsCalculator {

    public static int[] findFactors(int number) {
        int count = 0;
        // First loop to find the count of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        // Second loop to populate the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    public static double sumOfSquaresOfFactors(int[] factors) {
        double sumSquares = 0;
        for (int i = 0; i < factors.length; i++) {
            sumSquares += Math.pow(factors[i], 2);
        }
        return sumSquares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);
        
        System.out.print("Factors: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquaresOfFactors(factors));
        
        sc.close();
    }
}
