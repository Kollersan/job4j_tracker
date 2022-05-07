package ru.job4j.tracker;

public class TransportUsage {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle autobus = new Autobus();
        Vehicle train = new Train();
        Vehicle[] vehicles = new Vehicle[]{airplane, autobus, train};
        for (Vehicle a : vehicles) {
            a.move();
        }
    }
}
