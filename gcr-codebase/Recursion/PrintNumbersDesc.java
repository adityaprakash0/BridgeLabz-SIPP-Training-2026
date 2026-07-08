public class PrintNumbersDesc {

    public static void printNto1(int n) {
        if (n == 0) {
            return;
        }
        
        System.out.print(n + " ");
        printNto1(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Output:");
        printNto1(n);
        System.out.println(); 
    }
}
