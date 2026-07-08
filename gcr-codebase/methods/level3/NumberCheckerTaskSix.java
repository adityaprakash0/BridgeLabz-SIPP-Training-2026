public class NumberCheckerTaskSix {

    public static int sumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 1) return false;
        return sumOfProperDivisors(number) == number;
    }

    public static boolean isAbundantNumber(int number) {
        if (number <= 1) return false;
        return sumOfProperDivisors(number) > number;
    }

    public static boolean isDeficientNumber(int number) {
        if (number <= 1) return false;
        return sumOfProperDivisors(number) < number;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sumOfFactorials = 0;
        
        while (temp > 0) {
            int digit = temp % 10;
            sumOfFactorials += factorial(digit);
            temp /= 10;
        }
        return sumOfFactorials == number;
    }

    public static void main(String[] args) {
        int testNumber = 28;
        System.out.println("--- Task 6 Analysis for Number: " + testNumber + " ---");
        
        System.out.println("Is Perfect? " + isPerfectNumber(testNumber));
        System.out.println("Is Abundant? " + isAbundantNumber(testNumber));
        System.out.println("Is Deficient? " + isDeficientNumber(testNumber));
        System.out.println("Is Strong? " + isStrongNumber(testNumber));
    }
}
