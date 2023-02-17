package lesson10.practice;

public class Car {
    private String make;
    private String model;
    private String color;
    private int year;
    private int power;
    private int price;

    public Car() {
        System.out.println("call default constructor");
    }

    public String getMake() {
        return make;
    }


    public Car(String make, String model, String color, int year, int power) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.power = power;
//        this.price = price;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void drive() {
    System.out.println("Drive fast! " + make + " " + model + " " + color + " " + year + " " + power + " " + price);
}
    public void stop() {
        pumpBrakeFluid();
    System.out.println("Stop!" + model);
}
private void pumpBrakeFluid(){
    System.out.println("Push brake pedal to pump the fluid!");
}
    public void park() {
    System.out.println("Park!" + make);
}
    public void horn() {
    System.out.println("Horn!" + power);
}

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", power=" + power +
                ", price=" + price +
                '}';
    }
}