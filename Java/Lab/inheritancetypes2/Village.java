public class Village extends Country {
    String villageName = "Dhading";
    String nearestCity = "Kathmandu";

    public Village() {
        System.out.println("Village created: " + villageName);
    }

    public void showVillageInfo() {
        showCountryInfo(); // access Country method directly
        System.out.println("Village: " + villageName);
        System.out.println("Nearest City: " + nearestCity);
    }
}
