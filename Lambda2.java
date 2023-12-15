public class Lambda2 {
    public static void main(String[] args) {
        Interf n = new InvokingwithoutLambda();
        n.m1();
    }

    interface Interf {
        void m1();
    }

    static class InvokingwithoutLambda implements Interf {
        public void m1() {
            System.out.println("hello i'm implementation of m1");
        }
    }
}
