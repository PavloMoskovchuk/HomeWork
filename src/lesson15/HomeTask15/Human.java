package lesson15.HomeTask15;

public class Human implements DrivingProcess, FlyingProcess {

    @Override
    public void drive() {
        System.out.println("Human can drive");
    }

    @Override
    public void fly() {
        System.out.println("Human can fly");
    }
}

