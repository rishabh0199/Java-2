import java.util.Iterator;
import java.util.LinkedList;
class Linkedlist{
	public static void main(String args[])
	{
		LinkedList <String> lang = new LinkedList<String>();
		lang.add("java");
		lang.add("C");
		lang.add("Python");
		Iterator<String> itr = lang.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
}