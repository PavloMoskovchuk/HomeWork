package lesson26;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
            try {
                System.out.println("Enter your number: ");
                int a = sc.nextInt();
                checkNumber(a);
                System.out.println(a * a);

            } catch (MyException e) {
                System.out.println("Your number is negative, try again");
            } catch (InputMismatchException e) {
                System.out.println("Wrong input");
                sc.next();
            }
    }


    private static void checkNumber(int a) throws MyException {
        if (a < 0) {
            throw new MyException();
        }
    }
}
