package lesson15;

import lesson15.HomeTask15.Driver;
import lesson15.HomeTask15.Human;
import lesson15.HomeTask15.Pilot;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Pilot pilot = new Pilot();
        Driver driver = new Driver();

        human.drive();
        human.fly();

        pilot.drive();
        pilot.fly();

        driver.drive();
        driver.fly();
    }
}
