package lesson11.practice2;

import java.util.Objects;

public class Human {
    private String name;
    private String lastName;

    public Human() {
    }

    public Human(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void work() {
        System.out.println("Я работаю");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(lastName, human.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }

}
