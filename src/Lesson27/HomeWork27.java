package Lesson27;

import java.io.*;
import java.util.Scanner;

public class HomeWork27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        int b = 0;
        for(int i =0; i < 3; i++){
            try {
                System.out.println("Enter your string: ");
                str = sc.nextLine();
            } catch (Exception e) {
                e.printStackTrace();
            }

            try (OutputStream os = new FileOutputStream("test27.txt", true);
                 OutputStreamWriter osw = new OutputStreamWriter(os)) {
                osw.write(str);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try (FileInputStream fileInputStream = new FileInputStream("test27.txt"); InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream)) {

            while ((b = inputStreamReader.read()) != -1) {
                System.out.print((char) b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
