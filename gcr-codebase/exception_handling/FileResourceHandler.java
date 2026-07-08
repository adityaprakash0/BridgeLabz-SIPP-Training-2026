import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileResourceHandler {

    public static void readFirstLine(String fileName) {
        // try-with-resources automatically closes the BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String firstLine = reader.readLine();
            if (firstLine != null) {
                System.out.println("First line: " + firstLine);
            } else {
                System.out.println("The file is empty.");
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + fileName + ". Ensure it exists.");
        }
    }

    public static void main(String[] args) {
        String targetFile = "info.txt";
        readFirstLine(targetFile);
    }
}