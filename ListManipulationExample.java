import java.util.ArrayList;
import java.util.List;

public class ListManipulationExample {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> colors = new ArrayList<>();

        // Adding elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Accessing elements
        String firstColor = colors.get(0); // Retrieve the first element
        System.out.println("First color: " + firstColor);

        // Updating elements
        colors.set(1, "Yellow"); // Replace the second element with "Yellow"

        // Removing elements
        colors.remove(2); // Remove the third element

        // Iterating through the list
        for (String color : colors) {
            System.out.println("Color: " + color);
        }
    }
}
/*We create an ArrayList called colors to store a list of strings.
We add elements using the add method.
We access elements using the get method.
We update elements using the set method.
We remove elements using the remove method.
We iterate through the list using a for-each loop. */