// Custom exception class
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulate a condition that might throw our custom exception
            int someValue = 5;
            if (someValue < 10) {
                throw new MyCustomException("SomeValue is too low!");
            }
            
            // If the condition is not met, continue with the program
            System.out.println("SomeValue is acceptable.");
        } catch (MyCustomException e) {
            // Handle our custom exception
            System.err.println("Custom Exception: " + e.getMessage());
        } catch (Exception e) {
            // Handle other exceptions if necessary
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
/* We create a custom exception class named MyCustomException, which extends the Exception class. This class has a constructor that allows you to set a custom error message.

In the CustomExceptionExample class, we have a main method that contains a try-catch block.

Inside the try block, we simulate a condition where if someValue is less than 10, we throw our custom exception by using throw new MyCustomException("SomeValue is too low!");.

In the catch block, we catch our custom exception (MyCustomException) and handle it by printing the custom error message. We also have a more general catch block to catch other types of exceptions that might occur.

When you run this program with someValue set to 5, it will throw the MyCustomException, and the custom error message will be displayed. If you set someValue to a value greater than or equal to 10, it will not throw the custom exception, and the program will continue to execute the code after the if statement.

Custom exceptions are useful for creating more meaningful and specific error handling in your Java programs, allowing you to handle exceptional cases in a way that makes sense for your application. */