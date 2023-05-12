package lesson33;

public class HomeWork33 {
    public static void main(String[] args) {

        ThreadRandom tr = new ThreadRandom();
        Thread thread1 = new Thread(tr);
        thread1.start();

    }
}