package lesson33;

import java.util.Random;

public class HomeWork33 {
    public static void main(String[] args) {

        ThreadRandom tr = new ThreadRandom();
        Thread thread1 = new Thread(tr);
        thread1.start();

        int a;
        try {
            while (true) {
                a = new Random().nextInt(1, 11);
                checkNumber(a);
                thread1.sleep(200);
                System.out.println(a);
            }
        } catch (RuntimeException | InterruptedException e) {
            throw new RuntimeException();
        } catch (MyRandomException e) {
            System.out.println("Your number is 5!");
        }
    }
    private static void checkNumber ( int a) throws MyRandomException {
        if (a == 5) {
            throw new MyRandomException();
        }
    }

}