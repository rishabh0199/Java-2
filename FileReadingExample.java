import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {
    public static void main(String[] args) {
        // Define the file path
        String filePath = "sample.txt";

        try {
            // Create a FileReader to read the file
            FileReader fileReader = new FileReader(filePath);

            // Create a BufferedReader to read lines efficiently
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            
            // Read and print each line from the file
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the resources
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
