import java.io.FileWriter;
import java.io.IOException;

public class FileWritingExample {
    public static void main(String[] args) {
        // Define the file path
        String filePath = "output.txt";
        
        try {
            // Create a FileWriter to write to the file
            FileWriter fileWriter = new FileWriter(filePath);

            // Write some text to the file
            fileWriter.write("");
            fileWriter.write("This is a simple file writing example in Java.");

            // Close the FileWriter to save and close the file
            fileWriter.close();
            
            System.out.println("File has been written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
