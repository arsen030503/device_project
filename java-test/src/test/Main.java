package test;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numOfDevices = scn.nextInt();

        int priceSum = 0;
        int weightSum = 0;
        String[] devices = new String[numOfDevices];

        for (int i = 0; i < numOfDevices; i++) {
            String device = generateRandomDevice();
            if (device.equals("Tablet")) {
                devices[i] = device;

                Tablet obj = generateRandomTablet();

                int price = generateRandomPrice();
                obj.setPrice(price);
                priceSum += obj.getPrice();

                weightSum += obj.weight;
            } else if (device.equals("Laptop")) {
                devices[i] = device;
                Laptop obj = generateRandomLaptop();

                int price = generateRandomPrice();
                obj.setPrice(price);
                priceSum += obj.getPrice();

                weightSum += obj.weight;
            } else {
                devices[i] = device;
                Smartphone obj = generateRandomSmartphone();

                int price = generateRandomPrice();
                obj.setPrice(price);
                priceSum += obj.getPrice();

                weightSum += obj.weight;
            }
        }
        System.out.println("Total price of devices $" + priceSum);
        System.out.println("Total weight of devides " + weightSum + " grams");

        System.out.println("All the devices are: ");

        for (int i = 0; i < numOfDevices; i++) {
            System.out.println(devices[i]);
        }

    }

        private static String generateRandomDevice() {
        // Generate a random name
        String[] devices = {"Tablet", "Laptop", "Smartphone"};
        return devices[random.nextInt(devices.length)];
    }

    public static Smartphone generateRandomSmartphone() {
        String type = "Smartphone";
        int randomWeight = generateRandomWeight();
        int cameraRes = generateRandomCamRes();
        return new Smartphone(type, randomWeight, cameraRes);
    }

    public static Laptop generateRandomLaptop() {
        String type = "Laptopp";
        int randomWeight = generateRandomWeight();
        String screenSize = generateRandomScreenSize();
        return new Laptop(type, randomWeight, screenSize);
    }

    public static Tablet generateRandomTablet() {
        String type = "Tablet";
        int randomWeight = generateRandomWeight();
        boolean hasPen = random.nextBoolean();
        return new Tablet(type, randomWeight, hasPen);
    }
    private static Random random = new Random();

    private static int generateRandomPrice() {
        // Generate a random age between 18 and 65
        return random.nextInt(900) + 300;
    }
    private static int generateRandomWeight() {
        // Generate a random age between 18 and 65
        return random.nextInt(2500) + 900;
    }
    private static int generateRandomCamRes() {
        // Generate a random age between 18 and 65
        return random.nextInt(120) + 12;
    }

    private static String generateRandomScreenSize() {
        // Generate a random name
        String[] devices = {"1200x1000", "900x1200", "1000x2000"};
        return devices[random.nextInt(devices.length)];
    }
}