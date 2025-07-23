interface Vehicle {
    void start();

    void stop();
}

class VehicleDetails implements Vehicle {
    final String brand;

    public VehicleDetails(String brand) {
        this.brand = brand;
    }

    public final void displayBrand() {
        System.out.println("Vehicle Brand: " + brand);
    }

    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }
}

class Car extends VehicleDetails {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Car is starting");
    }
}

class Bike extends Car {

    public Bike(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Bike is starting");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        VehicleDetails myCar = new Car("Toyota");
        myCar.displayBrand();
        myCar.start();
        myCar.stop();
        System.out.println();
        VehicleDetails myBike = new Bike("Honda");
        myBike.displayBrand();
        myBike.start();
        myBike.stop();

        System.out.println("-----------");
        System.out.println("Name: Bimochan Poudel (20780638)");
        System.out.println("TU Roll: 28555/078");
        System.out.println("-----------");
    }
}
