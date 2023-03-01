package lesson15.HomeTask15;

public class Pilot extends Human {
    @Override
    public void drive() {
        System.out.println("Pilot can drive with license");
    }

    @Override
    public void fly() {
        System.out.println("Pilot flying on the plane");
    }
}
