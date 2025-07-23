public class Country {
    String countryName = "Nepal";
    String language = "Nepali";
    int population = 30000000;

    public Country() {
        System.out.println("Country created: " + countryName);
    }

    public void showCountryInfo() {
        System.out.println("Country: " + countryName);
        System.out.println("Language: " + language);
        System.out.println("Population: " + population);
    }
}
