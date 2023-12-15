import java.util.*;
public class SortMapBasisKEY {
    public static void main(String[] args) {
        // Create a HashMap with unsorted key-value pairs
        HashMap<Integer, String> unsortedMap = new HashMap<>();
        unsortedMap.put(3, "Three");
        unsortedMap.put(1, "One");
        unsortedMap.put(2, "Two");
        unsortedMap.put(5, "Five");
        unsortedMap.put(4, "Four");

        // Convert the HashMap to a TreeMap for sorting by keys
        TreeMap<Integer, String> sortedMap = new TreeMap<>(unsortedMap);

        // Iterate and print the sorted map by keys
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
