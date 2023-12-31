class A11 implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class A22 implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Threadrunnable {
	public static void main(String args[])
	{
		Runnable obj1=new A11();
		Runnable obj2 = new A22();
		
		Thread t1=new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
	}

}
