public class AverageMarks {
    public static void main(String[] args) {
        // Define the variables for each subject's marks
        int mathsMark = 94;
        int physicsMark = 95;
        int chemistryMark = 96;
        
        // Calculate the average (using 3.0 to ensure accurate decimal division)
        double averageMark = (mathsMark + physicsMark + chemistryMark) / 3.0;
        
        // Display the result
        System.out.println("Sam's average mark in PCM is " + averageMark);
    }
}