import java.util.HashMap;
import java.util.Map;

public class MapManipulationExample {
    public static void main(String[] args) {
        // Create a map of names and ages
        Map<String, Integer> personAges = new HashMap<>();

        // Adding key-value pairs
        personAges.put("Alice", 30);
        personAges.put("Bob", 25);
        personAges.put("Charlie", 35);

        // Accessing values by key
        int aliceAge = personAges.get("Alice"); // 30

        // Updating values
        personAges.put("Alice", 31);

        // Removing entries by key
        personAges.remove("Bob");

        // Iterating through the map
        for (Map.Entry<String, Integer> entry : personAges.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }
    }
}
/* We create a HashMap called personAges to store key-value pairs of names and ages.
We add key-value pairs using the put method.
We access values by key using the get method.
We update values by re-assigning them with the put method.
We remove entries by key using the remove method.
We iterate through the map using a for-each loop with entrySet().
These examples illustrate the basic manipulation operations for lists,
 sets, and maps in Java collections. You can adapt these operations to your specific
  use cases and work with more complex data structures as needed.*/