package lesson9;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row's of array:");
        int n = sc.nextInt();
        System.out.println("Enter number of column's of array: ");
        int m = sc.nextInt();
        int myArr[][] = new int[n][m];

        fillArraiRandom(myArr, n, m);
        printing(myArr);
        mainDiagonal(myArr);
        sideDiagonal(myArr);
        int myArray2[][] = rotatingClockwiseArray(myArr, n, m);
        printing(myArray2);
        System.out.println();
        printing(myArr);
        System.out.println();
        int myArray3[][] = rotatingСounterclockwiseArray(myArr, n, m);
        printing(myArray3);

    }


    static int[][] fillArraiRandom(int arr[][], int n, int m) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
        return arr;
    }

    static int[][] printing(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }

    static int[][] mainDiagonal(int arr[][]) {
        int mainDiagonalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    mainDiagonalSum += arr[i][j];
                }
            }
        }
        System.out.println("Main diagonal sum is: " + mainDiagonalSum);
        return arr;
    }

    static void sideDiagonal(int arr[][]) {
        int sideDiagonalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j == arr.length - 1) {
                    sideDiagonalSum += arr[i][j];
                }
            }
        }
        System.out.println("Side diagonal sum is: " + sideDiagonalSum);
    }

    static int[][] rotatingClockwiseArray(int[][] arr, int n, int m) {
        int arr2[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] = arr[n - j - 1][i];
            }
        }
        return arr2;
    }

    static int[][] rotatingСounterclockwiseArray(int[][] arr, int n, int m) {
        int arr3[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr3[i][j] = arr[j][m - i - 1];
            }
        }
        return arr3;
    }
}
