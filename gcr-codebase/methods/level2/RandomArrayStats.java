public class RandomArrayStats {

    public static int[] generate4DigitRandomArray(int size) {
        int[] randomArray = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate a random number between 1000 and 9999
            randomArray[i] = (int) (Math.random() * 9000) + 1000;
        }
        return randomArray;
    }

    // Returns array: [0] = average, [1] = min, [2] = max
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
            sum += numbers[i];
        }

        double average = sum / numbers.length;
        
        double[] results = new double[3];
        results[0] = average;
        results[1] = min;
        results[2] = max;
        
        return results;
    }

    public static void main(String[] args) {
        int size = 5;
        int[] randomNumbers = generate4DigitRandomArray(size);

        System.out.print("Generated 4-digit numbers: ");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();

        double[] stats = findAverageMinMax(randomNumbers);
        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + (int)stats[1]);
        System.out.println("Maximum: " + (int)stats[2]);
    }
}
