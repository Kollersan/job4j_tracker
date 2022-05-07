package ru.job4j.tracker;

public class Autobus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " ride on highway");
    }
}
