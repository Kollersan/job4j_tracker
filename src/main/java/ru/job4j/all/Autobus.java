package ru.job4j.all;

public class Autobus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " ride on highway");
    }
}
