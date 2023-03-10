package lesson7;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter symbol: ");
        String symbol = sc.nextLine();
        System.out.println("Enter your number: ");
        int number = sc.nextInt();

        System.out.println(getCube(number));
        printStar(number);
        printSymbolNumberTimes(number, symbol);
    }

    public static int getCube(int a) {
        return (int) Math.pow(a, 3);
    }

    public static void printStar(int a) {
        while (a > 0) {
            System.out.print("*");
            a--;
        }
        System.out.println();
    }

    public static void printSymbolNumberTimes(int number, String symbol) {
        for (int i = 0; i < number; i++) {
            System.out.print(symbol);
        }
    }
}