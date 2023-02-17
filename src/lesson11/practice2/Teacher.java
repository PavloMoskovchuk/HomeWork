package lesson11.practice2;

public class Teacher extends Human {
    private String scienceDegree;

    public Teacher(String name, String lastName, String scienceDegree) {
        super(name, lastName);
        this.scienceDegree = scienceDegree;
    }

    public String getScienceDegree() {
        return scienceDegree;
    }

    public void setScienceDegree(String scienceDegree) {
        this.scienceDegree = scienceDegree;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "scienceDegree='" + scienceDegree + '\'' +
                '}';
    }
}
