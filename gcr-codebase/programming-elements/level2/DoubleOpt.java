import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter double value for a: ");
        double doubleA = input.nextDouble();
        
        System.out.print("Enter double value for b: ");
        double doubleB = input.nextDouble();
        
        System.out.print("Enter double value for c: ");
        double doubleC = input.nextDouble();
        
        double dResult1 = doubleA + doubleB * doubleC;
        double dResult2 = doubleA * doubleB + doubleC;
        double dResult3 = doubleC + doubleA / doubleB;
        double dResult4 = doubleA % doubleB + doubleC;
        
        System.out.println("The results of Double Operations are " + dResult1 + ", " + dResult2 + ", " + dResult3 + ", and " + dResult4);
        
        input.close();
    }
}