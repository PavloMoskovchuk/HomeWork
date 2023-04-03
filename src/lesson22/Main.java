package lesson22;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Pavlo", 58);
        Student student2 = new Student("Itzhak", 51);
        Student student3 = new Student("Moshe", 90);
        Student student4 = new Student("Amir", 87);
        Student student5 = new Student("Yaniv", 79);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println(students);

//        List<Student> studentSortedByName = students.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
//        System.out.println(studentSortedByName);
//
//        List<Student> studentSortedByAverageMark = students.stream().sorted(Comparator.comparing(Student::getAverageMark)).collect(Collectors.toList());
//        System.out.println(studentSortedByAverageMark);

        Collections.sort(students, Comparator.comparing(Student::getAverageMark));
        System.out.println(students);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());

            }
        });

        System.out.println(students);

    }
}