
public class CarLombok {
    private String model;
    private String brand;
    private int year;
    private int price;
    private String color;
    private int quantity;
}

class CarDemoLombok {
    public static void main(String[] args) {

        CarLombok car1 = new CarLombok("GLE","Mercedes",2020,350000, "white", 5);
        CarLombok car2 = new CarLombok("Chrysler Fifth Avenue","Chrysler",1988,67458,"black", 5);

        System.out.println(car1);
        System.out.println(car2);

        System.out.println(car1.getColor());
        int year = car1.getYear();
        car1.setColor("black");

        System.out.println("Equal?"+ car1.equals(car2));
        System.out.println("Hashcode car1: " + car1.hashCode());
        System.out.println("Hashcode car2: " + car1.hashCode());

    }
}
