package lesson25;

import java.util.Scanner;

public class HomeWork25 {
    public static void main(String[] args) {
        for (; ; )
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your number: ");
                int n = sc.nextInt();
                System.out.println("Your number is: " + n);
                break;
            } catch (Exception e) {
                System.out.println("Wrong number. Try again!");
            }
    }
}
