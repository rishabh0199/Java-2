import java.util.ArrayList;
import java.util.Iterator;
class Arraylists{
	public static void main(String[] args)
	{
		ArrayList<Integer> value = new ArrayList<>();
		{
			value.add(1);
			value.add(2);
			value.add(3);
		}
		Iterator itr = value.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}