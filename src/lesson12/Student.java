package lesson12;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    {
        firstName = "John";
        System.out.println("1 step: initialization firstName");
    }
    {
        lastName = "Smith";
        System.out.println("2 step: initialization lastName");
    }
    {
        age = 23;
        System.out.println("3 step: initialization age");
    }
    public Student(){
        System.out.println("4 step: standatrd constructor");
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
