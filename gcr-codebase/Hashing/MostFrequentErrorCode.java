import java.util.HashMap;
import java.util.Map;

public class MostFrequentErrorCode {

    public static int mostFrequentErrorCode(int[] errorCodes) {
        Map<Integer, Integer> frequency = new HashMap<>();

        int mostFrequent = errorCodes[0];
        int maxCount = 0;

        for (int code : errorCodes) {
            int count = frequency.getOrDefault(code, 0) + 1;
            frequency.put(code, count);

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = code;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        int[] errorCodes = {500, 404, 500, 200, 404, 500, 503};

        System.out.println(mostFrequentErrorCode(errorCodes));
    }
}
