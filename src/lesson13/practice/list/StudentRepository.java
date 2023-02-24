package lesson13.practice.list;

import lesson13.practice.student.Student;

import java.util.Random;

import static java.lang.Math.random;

public class StudentRepository {
    public static final int LIST_SIZE = 10;
    private Student[] students = new Student[LIST_SIZE];
    public StudentRepository() {
        fillStudentsList();
    }
    public Student[] findAll() {
        return students;
    }

    private void fillStudentsList() {
        for (int i = 1; i < LIST_SIZE; i++) {
            Student student = getNewRandomStudent();
            student.setId(i);

            save(student);
        }
    }
    public void save (Student student) {
        for(int i = 0; i < students.length; i++) {
            if(students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }
    private static Student getNewRandomStudent() {
        Random random = new Random();

        int age = random.nextInt(20, 30);
        int averageScore = random.nextInt(0, 100);
        int nameSize = random.nextInt(4, 8);

        String firstName = randomName(nameSize);
        String lastName = randomName(nameSize);

        return new Student(0, firstName, lastName, age, averageScore);
    }

    private static String randomName(int nameSize) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder name = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < nameSize; i++) {
            name.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }
        name.setCharAt(0, Character.toUpperCase(name.charAt(0)));
        return name.toString();

    }

}
