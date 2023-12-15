class A{
	int age;
	String name;
	public A()
	{
		name="rishabh";
		age=30;
	}
	public A(int age, String name) {
		this.name=name;
		this.age=age;
		
	}
}
    class Constructor {
	public static void main(String args[])
	{
		A obj = new A();
		System.out.println(obj.name);
		A obj1 =new A(30,"Rishabh");
		System.out.println(obj.name+" "+obj.age);
		
	}

}
