import java.io.*;
import java.util.*;
public class Treeset {
	public static void main(String args[])
	{
		TreeSet <String> tree = new TreeSet<>();
		{
			tree.add("Nem");
			tree.add("Banana");
			tree.add("Mango");
			Iterator<String> itr = tree.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println("now in descending order");
			Iterator<String> it = tree.descendingIterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
	}

}
