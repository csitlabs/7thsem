package encapsulation;

public class Car {
    private String carName;
    private String color;
    private float price;

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarColor(String color) {
        this.color = color;
    }

    public void setCarPrice(int price) {
        this.price = price;
    }

    public String getCarName() {
        return this.carName;
    }

    public String getColor() {
        return this.color;
    }

    public float getPrice() {
        return this.price;
    }
}
