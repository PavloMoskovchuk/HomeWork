package lesson6;

import java.util.Scanner;

public class HomeWorkAdditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long result;
        int number;
        int temp = 1;
        long[] arr = new long[100];
        for (int k = 0; ; k++) {
            result = 1;
            System.out.println("Enter your number: ");
            number = sc.nextInt();

            if (arr[number] != 0) {                                 //Already existing Factorial
                System.out.println("Already existing Factorial of " + number + " is: " + arr[number]);
            } else if (arr[number] == 0 && temp == 1) {             //Counting Factorial
                for (int i = 1; i <= number; i++) {
                    result *= i;
                    arr[i] = result;
                }
                System.out.println("Counted Factorial of " + number + " is: " + result);
            } else if (arr[number] == 0 && temp != 1) {             //Counting Factorial in the range from available till entered number
                for (int i = temp + 1; i <= number; i++, temp++) {
                    result = arr[temp] * i;
                    arr[i] = result;
                    //System.out.println(result + "partly counting");
                }
                System.out.println("Partly counted factorial of: " + number + " is: " + result);
            }
            temp = number;
        }
    }
}