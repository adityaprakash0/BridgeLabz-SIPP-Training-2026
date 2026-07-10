public class CpuSpikeDetection {
    
    public static int maxSubarrayOfSizeK(int[] cpuLoad, int k) {
        int windowSum = 0, maxSum = Integer.MIN_VALUE;
        int start = 0;
        
        for (int end = 0; end < cpuLoad.length; end++) {
            windowSum += cpuLoad[end]; // Add the next element
            
            // Slide the window once we hit the required size 'k'
            if (end >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= cpuLoad[start]; // Remove the element going out
                start++; // Slide the window ahead
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] cpuReadings = {10, 20, 50, 80, 40, 30, 90, 100, 20};
        int windowSize = 5;
        
        int maxSpike = maxSubarrayOfSizeK(cpuReadings, windowSize);
        
        System.out.println("CPU Readings Stream: [10, 20, 50, 80, 40, 30, 90, 100, 20]");
        System.out.println("Highest CPU load in a " + windowSize + "-second window: " + maxSpike);
    }
}
