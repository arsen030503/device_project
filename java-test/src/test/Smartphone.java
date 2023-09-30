package test;

public class Smartphone extends Device{
    int cameraResolution;
    Smartphone(String type, int weight, int cameraResolution) {
        super(type, weight);
        this.cameraResolution = cameraResolution;
    }
}
