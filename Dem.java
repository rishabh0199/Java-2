
class Innerclass {
	int a;
	int b;
	public void show1() {
		System.out.println("i am in outer class");
	}
	static class Innertoinner{
		public void show()
		{
			System.out.println("i am in inner class");
		}
	}
}

public class Dem{	
	public static void main(String[] args) {
	Innerclass ab= new Innerclass();
	ab.show1();
	Innerclass.Innertoinner n = new Innerclass.Innertoinner();
			n.show();
			
	}
}
