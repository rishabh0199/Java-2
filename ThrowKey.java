
public class ThrowKey {
	public static void main(String args[])
	{
		int i=20;
		int j=0;
		
		
		try {
			
			j=18/i;
			if(j==0) {
				throw  new ArithmeticException("Exception thrown");
			}
		}
		
		
		catch(ArithmeticException e){
			
				j=18/1;
				System.out.println("default output" +j);
			
			System.out.println(e);
			
		}
		
		System.out.println("Bye");
	}

}
