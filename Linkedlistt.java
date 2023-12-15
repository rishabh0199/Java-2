import java.util.*;
public class Linkedlistt {
	public static void main(String args[])
	{
		LinkedList<Integer> one = new LinkedList<>();
		{
			one.add(8);
			one.add(1);
			one.add(2);
			one.add(3);
			one.add(4);
			
			one.remove(1);
			
			 Iterator<Integer> itr=one.iterator(); 
			 while(itr.hasNext()) {
			 System.out.println(itr.next()); }
			 
//			Collections.sort(one);
//			
//			Iterator<Integer> itr1=one.iterator();
//			while(itr1.hasNext())
//			{
//				System.out.println(itr1.next());
//			}
			LinkedList<Integer> two = new LinkedList<>();
			{
				one.addAll(two);
				Iterator<Integer> itr2=one.iterator();
				while(itr2.hasNext())
				{
					System.out.println(itr2.next());
				}

		}
	}
	}
}
