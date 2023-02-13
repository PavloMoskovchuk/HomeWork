package lesson10.practice;

public class mainPractice {
    public static void main(String[] args) {
        Car Chrysler = new Car("Chrysler", "200_C", "blue", 2007, 170);
//        Chrysler.setMake("Chrysler");
//        Chrysler.setModel("200_C");
//        Chrysler.setColor("Dark Grey");
//        Chrysler.setYear(2014);
//        Chrysler.setPower(185);
//        Chrysler.setPrice(11500);
//        Chrysler.model = "200_C";
//        Chrysler.color = "Dark Grey";
//        Chrysler.year = 2015;
//        Chrysler.power = 185;
//        Chrysler.price = 11500;
        System.out.println(Chrysler);

//        Chrysler.drive();
//        Chrysler.stop();
//        Chrysler.park();
//        Chrysler.horn();

//        Car Lanos = new Car();
//        Lanos.make = "Daewoo";
//        Lanos.model = "Sens";
//        Lanos.color = "Beige";
//        Lanos.year = 2004;
//        Lanos.power = 100;
//        Lanos.price = 3000;
//        System.out.println(Lanos);
//        Lanos.color = "Black";
//        System.out.println(Lanos);
//        Dog puppy = new Dog();
//        puppy.name = "Buudy";
//        puppy.bark();
//        System.out.println(puppy);
        PaintService kiyvPaintService = new PaintService();
        Chrysler = kiyvPaintService.paint(Chrysler, "Light Grey");
        System.out.println(Chrysler);

    }
}
