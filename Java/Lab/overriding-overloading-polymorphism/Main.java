public class Main {
    public static void main(String[] args) {

        System.out.println("-----------");
        System.out.println("Name: Bimochan Poudel (20780638)");
        System.out.println("TU Roll: 28555/078");
        System.out.println("-----------");

        Calculator calc = new Calculator();
        System.out.println("Sum of two integers: " + calc.sum(5, 10));
        System.out.println("Sum of two doubles: " + calc.sum(5.5, 10.5));
        System.out.println("Sum of three integers: " + calc.sum(1, 2, 3));

        Calculator advCalc = new AdvancedCalculator();
        System.out.println("Sum from AdvancedCalculator: " + advCalc.sum(5000, 10000));
    }

}
