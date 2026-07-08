import java.util.Scanner;

public class NaturalNumberSum {

    public static int sumRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number (N): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            int recursiveResult = sumRecursive(n);
            int formulaResult = sumFormula(n);

            System.out.println("Sum using Recursion: " + recursiveResult);
            System.out.println("Sum using Formula: " + formulaResult);

            if (recursiveResult == formulaResult) {
                System.out.println("Both computations match and are correct!");
            } else {
                System.out.println("Mismatch found in computations.");
            }
        }
        sc.close();
    }
}
