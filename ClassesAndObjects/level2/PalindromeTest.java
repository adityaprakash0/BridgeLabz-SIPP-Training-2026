// Class Definition
class PalindromeChecker {
    // Private attribute
    private String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Getter and Setter
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    // Method to check if text is palindrome
    public boolean isPalindrome() {
        // Clean the string: remove spaces and convert to lowercase for accurate checking
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();
        int length = cleanText.length();
        
        for (int i = 0; i < length / 2; i++) {
            if (cleanText.charAt(i) != cleanText.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // Method to display the result
    public void displayResult() {
        System.out.println("Text: \"" + text + "\"");
        if (isPalindrome()) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }
        System.out.println("-------------------------");
    }
}

// Main class to test
public class PalindromeTest {
    public static void main(String[] args) {
        // Test with different strings
        PalindromeChecker checker1 = new PalindromeChecker("Racecar");
        PalindromeChecker checker2 = new PalindromeChecker("Hello World");
        
        checker1.displayResult();
        checker2.displayResult();
    }
}
