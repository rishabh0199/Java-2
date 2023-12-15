import java.util.*;
class Arraylist{
	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<>();
		{
			names.add("Rishabh");
			names.add("Pushkar");
			names.add("Anurag");
			Collections.sort(names);
		}
		/*
		 * Iterator itr = names.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
		 ArrayList<String> al2=new ArrayList<String>();
		 al2.add("Rishabh");
		  al2.add("Ravi");  
		  al2.add("Hanumat");  
		  names.retainAll(al2);  
		  System.out.println("iterating the elements after retaining the elements of al2");  
		  Iterator itr1=names.iterator();  
		  while(itr1.hasNext()){  
		   System.out.println(itr1.next());  
	}
	}
}