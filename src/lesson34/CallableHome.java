package lesson34;

import java.util.concurrent.Callable;

public class CallableHome implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int number = (int) (Math.random() * 50);
        return number;
    }
}


