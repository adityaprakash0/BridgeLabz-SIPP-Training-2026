import java.util.Scanner;

public class  calculateRounds{

    static double calRounds(
            double a, double b, double c) {

        double perimeter = a + b + c;
        return 5000.0 / perimeter;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Side 1: ");
        double a = sc.nextDouble();

        System.out.print("Side 2: ");
        double b = sc.nextDouble();

        System.out.print("Side 3: ");
        double c = sc.nextDouble();

        System.out.println("Rounds Required = "
                + calculateRounds(a, b, c));

        sc.close();
    }
}
