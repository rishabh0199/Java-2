public class Lambda1 {
    public static void main(String[] args) {
        // Create a lambda expression that implements the run method of the Runnable interface
        Runnable hello = () -> System.out.println("Hello");

        // Execute the lambda expression
        hello.run();
    }
}
