import java.util.Scanner;

public class LineEquation {

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Returns array [slope(m), y-intercept(b)]
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - (slope * x1);
        return new double[]{slope, yIntercept};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 and y1: ");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        System.out.println("Enter x2 and y2: ");
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();

        System.out.println("Euclidean Distance: " + calculateDistance(x1, y1, x2, y2));
        
        if (x1 == x2) {
            System.out.println("Vertical line equation: x = " + x1);
        } else {
            double[] equation = calculateLineEquation(x1, y1, x2, y2);
            System.out.println("Equation of line: y = " + equation[0] + " * x + " + equation[1]);
        }
        sc.close();
    }
}
