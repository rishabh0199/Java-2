
public class check {

}
 
class Rishabhh
{
	public Rishabhh() 
	{
		super();
		System.out.println("in A");
	}
	public Rishabhh(int n)
	{
		super();
		System.out.println("in A int");
	}
}

class B extends Rishabhh
{
	public B()
	{
		super();
		System.out.println("in B");
	}
	public B(int n)
	{
		this();  //call constructor of same class
		System.out.println("in B int");
	}
}
 class Demo {
	public static void main(String[] args) 
	{
		
//		B obj=new B();
		B obj=new B(5);
	}
}

