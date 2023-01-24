package lesson5;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = 0;
        int min = 0;
        if (a > b) {
            max = a;
            min = b;
            System.out.println("Min number is " + min);
            System.out.println("Max number is " + max);
        } else if (a < b) {
            max = b;
            min = a;
            System.out.println("Min number is " + min);
            System.out.println("Max number is " + max);
        } else {
            System.out.println("a equals b");
        }
        if (a%2 == 0 ) {
            System.out.println("Number a is even");
        }
        else {
            System.out.println("Number a is odd");
        }
        sc.close();
    }
}
