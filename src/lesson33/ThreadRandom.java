package lesson33;

import java.util.Random;

public class ThreadRandom extends Thread{
    public void run() {
        try {
            while (true) {
                int a = new Random().nextInt(1, 11);
                checkNumber(a);
                ThreadRandom.sleep(200);
                System.out.println(a);
            }
        } catch (RuntimeException e) {
            throw new RuntimeException();
        } catch (InterruptedException e) {
            System.out.println("Your number is 5. Thread is interrupted");
        }
    }

    private static void checkNumber(int a) {
        if (a == 5) {
            Thread.currentThread().interrupt();
        }
    }
}
