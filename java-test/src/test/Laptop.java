package test;

public class Laptop extends Device{
    String screenSize;
    Laptop(String type, int weight, String screenSize) {
        super(type, weight);
        this.screenSize = screenSize;
    }
}
