package lesson10;

public class Student {
    private String firstName;
    private String lastName;
    private String faculty;
    private int grade;
    private int age;
    public Student() {
    }
    public Student(String firstName, String lastName, String faculty, int grade, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.faculty = faculty;
        this.grade = grade;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", faculty='" + faculty + '\'' +
                ", grade=" + grade +
                ", age=" + age +
                '}';
    }
}
