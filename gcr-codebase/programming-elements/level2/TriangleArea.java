import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inchToCmConversion = 2.54;
        
        System.out.print("Enter triangle base in cm: ");
        double baseCm = input.nextDouble();
        
        System.out.print("Enter triangle height in cm: ");
        double heightCm = input.nextDouble();
        
        double areaCmSq = 0.5 * baseCm * heightCm;
        
        double baseInches = baseCm / inchToCmConversion;
        double heightInches = heightCm / inchToCmConversion;
        double areaInchesSq = 0.5 * baseInches * heightInches;
        
        System.out.println("The Area of the triangle in sq in is " + areaInchesSq + " and sq cm is " + areaCmSq);
        
        input.close();
    }
}