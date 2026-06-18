import java.util.Scanner;

public class CharacterFrequencyTable {

    public static String[][] getCharacterFrequencies(String text) {
        int[] frequency = new int[256];
        int uniqueCount = 0;

        // Count frequencies and unique characters
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 0) {
                uniqueCount++;
            }
            frequency[text.charAt(i)]++;
        }

        // Populate 2D array
        String[][] results = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                results[index][0] = String.valueOf((char) i);
                results[index][1] = String.valueOf(frequency[i]);
                index++;
            }
        }
        return results;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String[][] freqs = getCharacterFrequencies(text);
        
        System.out.println("\n--- Character Frequencies ---");
        for (int i = 0; i < freqs.length; i++) {
            System.out.println("'" + freqs[i][0] + "' : " + freqs[i][1]);
        }
        input.close();
    }
}