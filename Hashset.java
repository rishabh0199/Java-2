import java.util.HashSet;
import java.util.Iterator;
class Hashset{
	public static void main(String[] args)
	{
		HashSet<String> names = new HashSet<>();
		{
			names.add("Rishabh");
			names.add("Pushkar");
			names.add("Anurag");
		}
		Iterator itr = names.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}