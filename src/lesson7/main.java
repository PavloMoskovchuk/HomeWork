package lesson7;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter symbol: ");
        String symbol = sc.nextLine();
        System.out.println("Enter your number: ");
        double number = sc.nextDouble();

        System.out.println(getCube(number));
        printStar(number);
        printSymbolNumberTimes(number, symbol);
    }

    public static double getCube(double a) {
        return Math.pow(a, 3);
    }

    public static void printStar(double a) {
        while (a > 0) {
            System.out.print("*");
            a--;
        }
        System.out.println();
    }

    public static void printSymbolNumberTimes(double number, String symbol) {
        for (int i = 0; i < (int) number; i++) {
            System.out.print(symbol);
        }
    }
}
