package lesson32;

public class TestThread implements Runnable {

    @Override
    public void run() {
        for(int i = 1; i <=10; i++){
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
