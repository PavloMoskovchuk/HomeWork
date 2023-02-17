package lesson11.HomeWork;

public class Automobile extends Car{
    private int passengerCapacty;
    private int maxWeight;

    public Automobile(String type, String make, String model, int year, int passengerCapacty, int maxWeight) {
        super(type, make, model, year);
        this.passengerCapacty = passengerCapacty;
        this.maxWeight = maxWeight;
    }

    public int getPassengerCapacty() {
        return passengerCapacty;
    }

    public void setPassengerCapacty(int passengerCapacty) {
        this.passengerCapacty = passengerCapacty;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "passengerCapacty=" + passengerCapacty +
                ", maxWeight=" + maxWeight +
                '}';
    }
}
