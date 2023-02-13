package lesson10;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines in new Array: ");
        int lines = sc.nextInt();
        System.out.println("Enter number of columns in new Array: ");
        int columns = sc.nextInt();
        int[][] myArray = new int[lines][columns];

        fillArrayWithRandomNumbers(myArray, lines, columns);
        printMyArray(myArray);
        System.out.println();

        int[][] copy = myArray;
        standartSorting(copy, lines, columns);
        printMyArray(copy);
        System.out.println();

        reverseSorting(myArray, lines, columns);
        printMyArray(myArray);
    }

    public static int[][] fillArrayWithRandomNumbers(int[][] myArray, int lines, int columns) {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                Random randomNumbers = new Random();
                myArray[i][j] = randomNumbers.nextInt(100);
            }
        }
        return myArray;
    }

    public static void printMyArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] standartSorting(int[][] copy, int lines, int columns) {
        for (int i = 0; i < copy.length; i++) {
            Arrays.sort(copy[i]);
        }
        return copy;
    }

    static int[][] reverseSorting(int[][] myArray, int lines, int columns) {
        for (int i = 0; i < lines; i++) {
            for (int k = 0; k < columns; k++) {
                for (int j = 1; j < columns; j++) {
                    if (myArray[i][j - 1] < myArray[i][j]) {
                        int temp = myArray[i][j - 1];
                        myArray[i][j - 1] = myArray[i][j];
                        myArray[i][j] = temp;
                    }
                }
            }
        }
        return myArray;
    }
}