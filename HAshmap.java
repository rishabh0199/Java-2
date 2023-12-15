import java.util.*;
public class HAshmap {

	public static void main(String args[]) {
		
		HashMap <Integer, String> map = new HashMap<>();
		
		map.put(101, "MCA");
		map.put(102, "BCA");
		map.put(103, "BCA");
		
		System.out.println(map.keySet());
		
		for(Map.Entry m: map.entrySet())
		{
			System.out.println(m.getKey()+" "+ m.getValue());
		}
		
	}
}
