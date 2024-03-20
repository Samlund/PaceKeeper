public class TestClass extends Thread {
    @Override
    public void run() {
        while (!Thread.interrupted()) {
            System.out.println("running...");
        }
    }
}
