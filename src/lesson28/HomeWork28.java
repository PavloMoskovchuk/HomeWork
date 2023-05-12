package lesson28;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class HomeWork28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        Path path = Path.of("1.txt");
        try {
            Files.createFile(path);
        } catch (IOException e) {
            System.out.println("File is already exists");
        }
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("Enter your string: ");
                str = sc.nextLine() + "\n";
                Files.write(path, str.getBytes(), StandardOpenOption.APPEND);
                System.out.println();
            } catch (IOException e) {
                System.out.println("Mistake to write in to the file");
            }
        }
        try {
            Files.readAllLines(path).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
