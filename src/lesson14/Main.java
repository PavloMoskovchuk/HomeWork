package lesson14;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("John", "Smith", 30);
        Student student = new Student("Pavlo", "Moskovchuk", 35, 3, "Computer Science");

        System.out.println(teacher.introduction());
        teacher.age();

        System.out.println(student.introduction());
        student.age();
        student.information();
    }
}