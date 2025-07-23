public class City extends State {
    String cityName = "Kathmandu";
    int cityPopulation = 1000000;

    public City() {
        System.out.println("City created: " + cityName);
    }

    public void showCityInfo() {
        showStateInfo(); // call method from State
        System.out.println("City: " + cityName);
        System.out.println("City Population: " + cityPopulation);
    }
}
