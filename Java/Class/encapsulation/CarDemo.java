package encapsulation;

public class CarDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.setCarName("Honda");
        c.setCarColor("Black");
        c.setCarPrice(100000);

        System.out.println(c.getCarName());
        System.out.println(c.getColor());
        System.out.println(c.getPrice());
    }
}
