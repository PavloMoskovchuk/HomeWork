package lesson32;

public class HomeWork32 {
    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        Thread thread1 = new Thread(testThread);
        Thread thread2 = new Thread(testThread);

        thread1.start();
        thread2.start();

    }
}
