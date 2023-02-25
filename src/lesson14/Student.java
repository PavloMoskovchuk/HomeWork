package lesson14;

public class Student extends Human {
    private String firstName;
    private String lastName;
    private int age;
    private int grade;
    private String faculty;

    public Student() {

    }

    public Student(String firstName, String lastName, int age, int grade, String faculty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.grade = grade;
        this.faculty = faculty;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                ", faculty='" + faculty + '\'' +
                '}';
    }

    @Override
    public String introduction() {
        return "Hi! My name is " + firstName + " " + lastName + ".";
    }

    @Override
    public void age() {
        System.out.println("I`m " + age + "year`s old.");
    }

    @Override
    public void information() {
        System.out.println("i`m a student on " + faculty + " faculty" + " and my grade is " + grade + ".");
    }
}
