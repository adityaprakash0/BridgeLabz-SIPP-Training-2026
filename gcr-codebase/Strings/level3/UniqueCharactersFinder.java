import java.util.Scanner;

public class UniqueCharactersFinder {

    // Custom length method
    public static int getCustomLength(String text) {
        int count = 0;
        try {
            while (true) { text.charAt(count); count++; }
        } catch (Exception e) { return count; }
    }

    // Find unique characters
    public static char[] findUniqueCharacters(String text) {
        int length = getCustomLength(text);
        char[] tempUnique = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            
            // Check against already found unique characters
            for (int j = 0; j < uniqueCount; j++) {
                if (tempUnique[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                tempUnique[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create exact-sized array
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = tempUnique[i];
        }
        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        char[] unique = findUniqueCharacters(text);
        
        System.out.print("Unique Characters: ");
        for (int i = 0; i < unique.length; i++) {
            System.out.print(unique[i] + " ");
        }
        System.out.println();
        input.close();
    }
}