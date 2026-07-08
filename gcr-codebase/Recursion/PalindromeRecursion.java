public class PalindromeRecursion {

    public static boolean isPalindrome(String str) {
        if (str == null || str.length() <= 1) {
            return true;
        }
        
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        
        return isPalindrome(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        String input = "madam";
        boolean result = isPalindrome(input);
        
        System.out.println("Input:\n" + input);
        System.out.println("Output:\n" + (result ? "Palindrome" : "Not a Palindrome"));
    }
}
