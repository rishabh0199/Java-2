import java.util.*;
import java.util.Iterator;
import java.util.List;
class MyList{
	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<String>();
		{
			names.add("Rishabh");
			names.add("Pushkar");
			names.add("Anurag");
		}
		String[] str= names.toArray(new String[names.size()]);
		//String[] st = names.toArray(new String[names.size()]);
		
		for(String s: str) {
			System.out.println(s);	
		}
		/*Iterator str = names.iterator();
		while(str.hasNext())
		{
			System.out.println(str.next());
		}*/
	}
}