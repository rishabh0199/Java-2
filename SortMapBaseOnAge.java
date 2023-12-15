import java.util.*;

public class SortMapBaseOnAge {
	public static void main(String args[])
	{
		
		Comparator<Integer> com = new Comparator<Integer>()
				{
					public int compare(Integer i, Integer j)
					{
						if(i%10>j%10)
							return 1;
						else
							return -1;
					}
				};
		List<Integer> nums = new ArrayList<>();
		nums.add(21);
		nums.add(22);
		nums.add(43);
		nums.add(5);
		
		Collections.sort(nums,com);
		System.out.println(nums);
	}

}
