public class NumberCheckerTaskFive {

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeonNumber(int number) {
        int square = (int) Math.pow(number, 2);
        int sumOfSquareDigits = 0;
        int temp = square;
        
        while (temp > 0) {
            sumOfSquareDigits += temp % 10;
            temp /= 10;
        }
        return sumOfSquareDigits == number;
    }

    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        int temp = Math.abs(number);
        
        if (temp == 0) return false;
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphicNumber(int number) {
        int square = (int) Math.pow(number, 2);
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    public static boolean isBuzzNumber(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }

    public static void main(String[] args) {
        int testNumber = 7;
        System.out.println("--- Task 5 Analysis for Number: " + testNumber + " ---");
        
        System.out.println("Is Prime? " + isPrime(testNumber));
        System.out.println("Is Neon? " + isNeonNumber(testNumber));
        System.out.println("Is Spy? " + isSpyNumber(testNumber));
        System.out.println("Is Automorphic? " + isAutomorphicNumber(testNumber));
        System.out.println("Is Buzz? " + isBuzzNumber(testNumber));
    }
}
