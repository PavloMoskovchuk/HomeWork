package lesson13.practice;

import lesson13.practice.statictic.studentService;
import lesson13.practice.student.Student;

public class Main {
    public static void main(String[] args) {
        studentService studentService = new studentService();
        //Student Student = new Student();
        studentService.printStudents();
        System.out.println();
//        studentService.sortStudentsByAverageScore();
//        studentService.printStudents();
    }




}
