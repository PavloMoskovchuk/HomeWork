package lesson11.practice2;

public class Student extends Human {
    private String group;

    public Student(String name, String lastName, String group) {
        super(name, lastName);
        this.group = group;
    }
public void study(){
    super.work();
    System.out.println("Я учусь");
}
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                '}';
    }
}
