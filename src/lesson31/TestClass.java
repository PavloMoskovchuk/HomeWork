package lesson31;

public class TestClass {
        private String name;
        private int age;
        public double info;

    public TestClass() {
        }

    public TestClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String getInfo(int age) {
        return age + " Hello";
    }

    public void setInfo(double info) {
        this.info = info;
    }
    private void test(){
            System.out.println("I'm test private method");
            System.out.println(getName() + " " + getAge());

    }
}
