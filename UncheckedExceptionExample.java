public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };

        try {
            // Attempt to access an element outside the array bounds
            int result = numbers[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the unchecked exception by printing an error message
            System.err.println("Array index out of bounds: " + e.getMessage());
        }
    }
}

/*Unchecked exceptions, also known as runtime exceptions, are exceptions that the
 *  compiler does not require you to catch or declare explicitly.
 *   They typically represent programming errors or unexpected runtime conditions.
 *    Here's an example of an unchecked exception: */