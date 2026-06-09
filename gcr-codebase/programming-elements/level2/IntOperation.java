import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter integer value for a: ");
        int intA = input.nextInt();
        
        System.out.print("Enter integer value for b: ");
        int intB = input.nextInt();
        
        System.out.print("Enter integer value for c: ");
        int intC = input.nextInt();
        
        int intResult1 = intA + intB * intC;
        int intResult2 = intA * intB + intC;
        int intResult3 = intC + intA / intB;
        int intResult4 = intA % intB + intC;
        
        System.out.println("The results of Int Operations are " + intResult1 + ", " + intResult2 + ", " + intResult3 + ", and " + intResult4);
        
        input.close();
    }
}