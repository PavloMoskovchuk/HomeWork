package lesson6;

public class HomeWork6 {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 10) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println();
        for (int k = 0; k <= 100; k += 2) {
            System.out.print(k + " ");
        }
        System.out.println();

        int factorial_of = 7;
        int result = 1;
        for (int l = 1; l <= factorial_of; l++) {
            //System.out.println(result);
            result *= l;
        }
        System.out.println("Faktorial of 7 is: " + result);

        System.out.print("Fibonacci numbers: ");
        for (int i = 0, i2 = 1, i3 = 1; i < 100; i3 = i + i2) {
            System.out.print(i + " ");
            i = i2;
            i2 = i3;
        }

    }
}
