import java.util.Scanner;

public class Level1TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter triangle base: ");
        double base = input.nextDouble();
        
        System.out.print("Enter triangle height: ");
        double height = input.nextDouble();
        
        double area = 0.5 * base * height;
        
        System.out.println("The Area of the triangle is " + area);
        input.close();
    }
}