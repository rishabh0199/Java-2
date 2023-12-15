import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return this.name.compareTo(otherPerson.name);
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old)";
    }
}

public class CustomObjectSortingExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Alice", 30));
        people.add(new Person("Charlie", 25));
        people.add(new Person("Bob", 35));

        // Sort the list of custom objects by name
        Collections.sort(people);

        // Print the sorted list
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
/* We create a custom Person class that implements the Comparable interface and defines
 *  a natural ordering based on the name field.
 *We create a list of Person objects, add them to the list,
 * and sort them using Collections.sort(people).
We override the toString method to provide a meaningful
 representation when printing the Person objects.
Remember that you can customize the sorting logic by modifying the compareTo method 
in your custom object class.
These are examples of sorting collections in Java. The Collections.sort() method works for lists,
 and the TreeSet class is used for sorted sets. You can adjust the sorting behavior
  by implementing the Comparable interface or by providing a custom Comparator when necessary.*/