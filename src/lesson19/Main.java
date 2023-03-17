package lesson19;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int randomNumber = random.nextInt(50);
            treeSet.add(randomNumber);
            hashSet.add(randomNumber);
            linkedHashSet.add(randomNumber);
        }
        System.out.println(treeSet);
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
    }
}
