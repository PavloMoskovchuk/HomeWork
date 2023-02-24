package lesson13.practice.statictic;

import lesson13.practice.list.StudentRepository;
import lesson13.practice.student.Student;

public class studentService {
    private StudentRepository studentRepository;

    public studentService() {
        studentRepository = new StudentRepository();
    }

    public void printStudents() {
        //printTop();
        for (Student student : studentRepository.findAll()) {
            if (student != null) {
                String info = String.format("%d %s %s %d %d",
                        student.getId(),
                        student.getFirstName(),
                        student.getLastName(),
                        student.getAge(),
                        student.getAverageScore());
                System.out.println(info);
            }
        }
    }
    public students sortStudentsByAverageScore(Student[] students) {
        Student[] sortedStudents = new Student[students.length];
        for (int i = 0; i < students.length; i++) {
            sortedStudents[i] = students[i];
        }
        for (int i = 0; i < sortedStudents.length; i++) {
            for (int j = i + 1; j < sortedStudents.length; j++) {
                if (sortedStudents[i].getAverageScore() < sortedStudents[j].getAverageScore()) {
                    Student temp = sortedStudents[i];
                    sortedStudents[i] = sortedStudents[j];
                    sortedStudents[j] = temp;
                }
            }
        }
        return students;
    }
    public Student[] findAll() {
        return studentRepository.findAll();
    }

}
