import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortingExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Charlie");
        names.add("Bob");

        // Sort the list in ascending order
        Collections.sort(names);

        // Print the sorted list
        for (String name : names) {
            System.out.println(name);
        }
    }
}
/* We create an ArrayList called names and add three String objects to it.
We use Collections.sort(names) to sort the names list in ascending (natural) order.
 The String class implements the Comparable interface, which defines a natural ordering 
 for strings.
We iterate through the sorted list and print the names in ascending order.*/