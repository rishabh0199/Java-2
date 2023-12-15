import java.util.HashMap;
import java.util.Map;

public class Hashmapp {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> firstMap = new HashMap<>();
        
        // Add key-value pairs to the first map
        firstMap.put(1, "One");
        firstMap.put(2, "Two");
        firstMap.put(3, "Three");
        
        // Create another map
        HashMap<Integer, String> secondMap = new HashMap<>();
        
        // Add key-value pairs to the second map
        secondMap.put(4, "Four");
        secondMap.put(5, "Five");
        
        // Use putAll to merge the contents of the second map into the first map
        firstMap.putAll(secondMap);
        
        // Display the merged map
        for (Map.Entry<Integer, String> entry : firstMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
