
abstract class Car {
	public abstract void drive();
	
	public abstract void doors();
	
	public abstract void Fly();
}

abstract class Bmw extends Car{
	public void drive(){
		System.out.println("i am Bmw");
	}
	public void doors() {
		System.out.println("i have 4 doors");
	}
}
class UpdatedBMW extends Bmw{
	public void Fly() {
		System.out.println("Flying");
	}
	
}
	public class Demo1{
		public static void main(String args[]) {
		Car obj = new UpdatedBMW();
		obj.drive();
		obj.doors();
		obj.Fly();
		}
	}
