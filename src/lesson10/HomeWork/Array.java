package lesson10.HomeWork;

import java.util.Scanner;

public class Array {
    public Array() {
    }

    public void array() {
        int[] myArray = new int[getNumber()];
        fillArrayWithRandomNumbers(myArray);
        printMyArray(myArray);
        standartSorting(myArray);
        printMyArray(myArray);
        reverseSorting(myArray);
        printMyArray(myArray);
    }

    static int getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Wrong input. Try again!");
            return getNumber();
        }
    }

    public void fillArrayWithRandomNumbers(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 100);
        }
    }

    public void printMyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void standartSorting(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i] < myArray[j]) {
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
    }

    public void reverseSorting(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
    }
}


