package test;

public class Device {
    String type;
    private int price;
    int weight;

    Device(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int priceOf) {
        price = priceOf;
    }
}
