package lesson11.HomeWork;

public class HomeWork {
    public static void main(String[] args) {
        Automobile myCar = new Automobile("Passenger Car", "Chrysler", "200_C", 2015, 5, 1750);
        Lorry myLorry = new Lorry("Track", "Kenworth", "T680", 2015, 25000, 50);
        System.out.println(myCar.getType());
        System.out.println(myLorry.getType());
    }

}
