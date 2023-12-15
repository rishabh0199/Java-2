class RishabhException extends Exception {
    public RishabhException(String string) {
        super(string);
    }
}

public class CustomException {
    public static void main(String args[]) {
        int i = 0;
        int j = 0;

        try {
            if (i == 0) {
                throw new RishabhException("Exception thrown");
            }

            j = 18 / i;
        } catch (RishabhException e) {
            j = 18 / 1; // Provide a default value
            System.out.println("Default output: " + j);
            System.out.println(e);
        }

        System.out.println("Bye");
    }
}
