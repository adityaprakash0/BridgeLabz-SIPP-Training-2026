import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Loops
    public static boolean checkPalindromeLoop(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursion
    public static boolean checkPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return checkPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Character Arrays
    public static boolean checkPalindromeArrays(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[text.length()];
        
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String text = input.next();

        System.out.println("\n--- Palindrome Checks ---");
        System.out.println("Logic 1 (Loops): " + checkPalindromeLoop(text));
        System.out.println("Logic 2 (Recursion): " + checkPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Logic 3 (Arrays): " + checkPalindromeArrays(text));
        
        input.close();
    }
}