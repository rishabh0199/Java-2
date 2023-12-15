import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempt to open a file that does not exist
            FileInputStream fileInputStream = new FileInputStream("nonexistent.txt");
        } catch (FileNotFoundException e) {
            // Handle the checked exception by printing an error message
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
/* checked exceptions are exceptions that the Java compiler forces you to handle explicitly
 *  by either using a try-catch block or declaring the exception using the throws
 *   keyword in the method signature. These exceptions typically represent situations
 *    that a program can reasonably anticipate and recover from. Here's an example of a
 *     checked exception: */
