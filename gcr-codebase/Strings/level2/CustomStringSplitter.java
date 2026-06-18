import java.util.Scanner;

public class CustomStringSplitter {

    // Method to find length without built-in length() [cite: 214]
    public static int getCustomLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split text into words manually [cite: 215]
    public static String[] splitIntoWordsCustom(String text) {
        int textLength = getCustomLength(text);
        if (textLength == 0) return new String[0];

        // Count words to size the array [cite: 217]
        int wordCount = 1;
        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        String currentWord = "";
        int wordIndex = 0;

        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex] = currentWord;
                wordIndex++;
                currentWord = "";
            } else {
                currentWord += text.charAt(i);
            }
        }
        words[wordIndex] = currentWord; // Add the last word [cite: 218]

        return words;
    }

    // Compare two string arrays [cite: 219]
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = input.nextLine(); [cite: 213]

        String[] customSplit = splitIntoWordsCustom(text);
        String[] builtInSplit = text.split(" "); [cite: 220]

        boolean isMatch = compareStringArrays(customSplit, builtInSplit); [cite: 221]

        System.out.println("\n--- Split Results ---");
        System.out.println("Arrays match: " + isMatch);
        for (int i = 0; i < customSplit.length; i++) {
            System.out.println("Word " + (i + 1) + ": " + customSplit[i]);
        }

        input.close();
    }
}