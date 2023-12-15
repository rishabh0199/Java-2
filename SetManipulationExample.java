import java.util.HashSet;
import java.util.Set;

public class SetManipulationExample {
    public static void main(String[] args) {
        // Create a set of integers
        Set<Integer> numbers = new HashSet<>();

        // Adding elements
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Removing elements
        numbers.remove(2);

        // Checking if an element exists
        boolean containsThree = numbers.contains(3); // true

        // Iterating through the set
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}
/* In this example:

We create a HashSet called numbers to store a set of integers.
We add elements using the add method.
We remove elements using the remove method.
We check if an element exists using the contains method.
We iterate through the set using a for-each loop. */