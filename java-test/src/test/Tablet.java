package test;

public class Tablet extends Device{
    boolean hasPen;
    Tablet(String type, int weight, boolean hasPen) {
        super(type, weight);
        this.hasPen = hasPen;
    }
}
