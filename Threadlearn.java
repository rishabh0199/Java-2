class A1 extends Thread {
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

class A2 extends Thread {
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

public class Threadlearn{
    public static void main(String[] args) {
        A1 r = new A1();
        r.start();

        A2 rr = new A2();
        rr.start();
    }
}
