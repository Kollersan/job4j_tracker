package ru.job4j.all;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " rides on rails");
    }
}
