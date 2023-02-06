package lesson8;

import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter desired length of array:");
        int length = sc.nextInt();
        int[] myArray = new int[length];
        fillingArrayWithRandomNumbers(myArray);
        printArray(myArray);
        System.out.println("Min value from myArray is: " + findMinValue(myArray));
        System.out.println("Max value from myArray is: " + findMaxValue(myArray));
        findAverageAndSumValue(myArray);

    }

    private static void findAverageAndSumValue(int[] arr) {
        int average = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = sum / arr.length;
        System.out.println("Average value from myArray is: " + average);
        System.out.println("Sum of myArray members : " + sum);
    }

    public static void fillingArrayWithRandomNumbers(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int findMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findMinValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
