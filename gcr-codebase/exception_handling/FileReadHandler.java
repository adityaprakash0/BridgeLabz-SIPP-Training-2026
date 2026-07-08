import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadHandler {

    // Method to handle the file reading logic
    public static void readDataFile(String fileName) {
        try {
            // Attempt to open and read the file
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);
            
            System.out.println("--- File Contents ---");
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
            
            // Close the scanner to prevent memory leaks
            fileReader.close();
            
        } catch (FileNotFoundException e) {
            // Catching the specific checked exception
            System.err.println("Error: File not found. Please ensure '" + fileName + "' exists in the directory.");
        }
    }

    public static void main(String[] args) {
        // Define the file name as a variable to avoid hardcoding
        String targetFile = "data.txt";
        
        System.out.println("Attempting to access the file system...");
        readDataFile(targetFile);
    }
}