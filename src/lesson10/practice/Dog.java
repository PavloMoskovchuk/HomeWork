package lesson10.practice;

public class Dog {
    String name;
    void bark() {
        System.out.println("Woof! Woof!" + " " + name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
