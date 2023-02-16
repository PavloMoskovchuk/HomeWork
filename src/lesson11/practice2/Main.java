package lesson11.practice2;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Pavlo", "Ivanov", "1");
//        s1.setName("Pavlo");
//        s1.setLastName("Moskovchuk");
//        s1.setGroup("1A05");

        Teacher t1 = new Teacher("Pavlo", "Moskovchuk", "1A05");
//        t1.setName("Ivan");
//        t1.setLastName("Ivanov");
//        t1.setScienceDegree("PhD");

        Human h1 = new Human();
        h1.setName("Havier");
        h1.setLastName("Gonzales");

        Human h2 = new Human();
        h2.setName("Sopo");
        h2.setLastName("Gabrielashvili");

        System.out.println(s1);
        System.out.println(s1.getName() + " " + s1.getLastName());
//        System.out.println(t1);
//        System.out.println(t1.getName() + " " + t1.getLastName());
//        System.out.println(h1.getName() + " " + h1.getLastName());
//        System.out.println(h1.equals(h2));
//        System.out.println("123".hashCode());
        System.out.println(s1);

    }
}
