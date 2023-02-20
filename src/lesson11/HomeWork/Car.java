package lesson11.HomeWork;

public class Car {
    private String type;
    private String make;
    private String model;
    private int year;

    public Car(String type, String make, String model, int year) {
        this.type = type;
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void information(){
        System.out.println(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
