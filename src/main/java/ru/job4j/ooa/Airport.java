package ru.job4j.ooa;

public class Airport {
    public static void main(String[] args) {
        Airbus airbus = new Airbus("А320");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine();

        airbus = new Airbus("А380");
        System.out.println(airbus);
        airbus.printCountEngine();

        airbus.setName("А380");
        System.out.println(airbus);
    }
}
