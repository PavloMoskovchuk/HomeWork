package lesson18;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Иван", "Иванов", 20);
        Student student2 = new Student("Петр", "Петров", 20);
        Student student3 = new Student("Сергей", "Сергеев", 20);

        ArrayList<Student> list = new ArrayList<Student>(5);
        list.add(student1);
        list.add(student2);
        list.add(student3);

        System.out.println(list.toString());

        ArrayList<Integer> testList = new ArrayList<Integer>(10);
        for(int i = 0; i < 10; i++) {
            testList.add((int) (Math.random() * 100));
        }
        System.out.println(testList.toString());

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < 2000000; i++) {
            linkedList.add(i);
        }
    }
}
