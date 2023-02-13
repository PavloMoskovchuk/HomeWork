package lesson10.practice;

import lesson10.practice.Car;

public class PaintService {
    Car paint(Car car, String newColor) {
        car.setColor(newColor);
        return car;
    }
}
