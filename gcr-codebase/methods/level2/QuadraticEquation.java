import java.util.Scanner;

public class QuadraticEquation {

    public static double[] findRoots(double a, double b, double c) {
        // Note: Formula is b^2 - 4ac, corrected from prompt's hint
        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta > 0) {
            double[] roots = new double[2];
            roots[0] = (-b + Math.sqrt(delta)) / (2 * a);
            roots[1] = (-b - Math.sqrt(delta)) / (2 * a);
            return roots;
        } else if (delta == 0) {
            double[] roots = new double[1];
            roots[0] = -b / (2 * a);
            return roots;
        } else {
            return new double[0]; // Empty array for negative delta (complex roots)
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value for c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("'a' cannot be zero for a quadratic equation.");
        } else {
            double[] roots = findRoots(a, b, c);
            
            if (roots.length == 2) {
                System.out.println("Roots are real and distinct:");
                System.out.println("Root 1 = " + roots[0]);
                System.out.println("Root 2 = " + roots[1]);
            } else if (roots.length == 1) {
                System.out.println("Roots are real and equal:");
                System.out.println("Root = " + roots[0]);
            } else {
                System.out.println("Roots are imaginary (negative delta). Returning empty set.");
            }
        }
        sc.close();
    }
}
