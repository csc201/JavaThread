public class Test implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        new Test();
    }
    public Test() throws InterruptedException {
        Thread t = new Thread(this);
        t.start();
        t.join();
        Thread t2 = new Thread(this);
        t2.start();
        System.out.println(t.isAlive());
    }
    public void run() {
        System.out.println("test");
    }
}