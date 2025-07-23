public class State extends Country {
    String stateName = "Bagmati";
    String capital = "Hetauda";

    public State() {
        super(); // call Country constructor
        System.out.println("State created: " + stateName);
    }

    public void showStateInfo() {
        showCountryInfo(); // parent method
        System.out.println("State: " + stateName);
        System.out.println("Capital: " + capital);
    }
}
