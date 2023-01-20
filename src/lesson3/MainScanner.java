package lesson3;
import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input data");
        int cons = sc.nextInt();
        System.out.println("Your number: " + cons);
        sc.close();

    }
}
