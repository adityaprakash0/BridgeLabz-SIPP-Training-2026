import java.util.Scanner;

public class FrequencyNestedLoops {

    public static String[] getFrequenciesNested(String text) {
        char[] chars = text.toCharArray();
        String[] tempResults = new String[chars.length];
        int resultCount = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue; // Skip already counted duplicates
            
            int count = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    chars[j] = '0'; // Mark as duplicate to avoid recounting
                }
            }
            tempResults[resultCount++] = chars[i] + " = " + count;
        }

        // Trim array
        String[] finalResults = new String[resultCount];
        for (int i = 0; i < resultCount; i++) {
            finalResults[i] = tempResults[i];
        }
        return finalResults;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String[] results = getFrequenciesNested(text);
        System.out.println("\n--- Frequencies ---");
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i]);
        }
        input.close();
    }
}