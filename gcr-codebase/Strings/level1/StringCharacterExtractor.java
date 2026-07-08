import java.util.Scanner;

public class StringCharacterExtractor {
    // Method to return characters without toCharArray()
    public static char[] extractCharacters(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter text: ");
        String text = input.next();
        
        char[] customArray = extractCharacters(text);
        char[] builtInArray = text.toCharArray();
        boolean isMatch = compareCharArrays(customArray, builtInArray);
        
        System.out.println("Arrays are identical: " + isMatch);
        
        input.close();
    }
}