public class Main {
    public static void main(String[] args) {
        System.out.println("=== Single Inheritance ===");
        State state = new State();
        state.showStateInfo();

        System.out.println("\n=== Multilevel Inheritance ===");
        City city = new City();
        city.showCityInfo();

        System.out.println("\n=== Hierarchical Inheritance ===");
        Village village = new Village();
        village.showVillageInfo();

        System.out.println("\n=== Final Keyword ===");
        FinalEg finalData = new FinalEg();
        finalData.displayFinalData();

        System.out.println("-----------");
        System.out.println("Name: Bimochan Poudel (20780638)");
        System.out.println("TU Roll: 28555/078");
        System.out.println("-----------");
    }
}
