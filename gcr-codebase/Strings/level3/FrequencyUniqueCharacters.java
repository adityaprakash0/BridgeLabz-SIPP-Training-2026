import java.util.Scanner;

public class FrequencyUniqueCharacters {

    // Reuse Unique Logic
    public static char[] getUniqueChars(String text) {
        char[] temp = new char[text.length()];
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < count; j++) {
                if (temp[j] == c) { isUnique = false; break; }
            }
            if (isUnique) temp[count++] = c;
        }
        char[] unique = new char[count];
        for (int i = 0; i < count; i++) unique[i] = temp[i];
        return unique;
    }

    // Count frequencies based on unique array
    public static String[][] getFrequenciesUsingUnique(String text) {
        char[] uniqueChars = getUniqueChars(text);
        String[][] results = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            int freq = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == uniqueChars[i]) freq++;
            }
            results[i][0] = String.valueOf(uniqueChars[i]);
            results[i][1] = String.valueOf(freq);
        }
        return results;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String[][] data = getFrequenciesUsingUnique(text);
        System.out.println("\n--- Frequencies ---");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Character: '" + data[i][0] + "' Count: " + data[i][1]);
        }
        input.close();
    }
}