public class Main {
    public static void main(String[] args) {

        System.out.println("-----------");
        System.out.println("Name: Bimochan Poudel (20780638)");
        System.out.println("TU Roll: 28555/078");
        System.out.println("-----------");

        Car cr = new Car();
        cr.setBrand("Mercedes");
        System.out.println(cr.getBrand());
        cr.startEngine();

        Bike bk = new Bike();
        bk.setBrand("Pulsar");
        System.out.println(bk.getBrand());
        bk.startEngine();
    }
}