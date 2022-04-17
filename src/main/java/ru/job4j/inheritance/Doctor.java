package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String direction;

    public Doctor() {
    }

    public Doctor(String direction) {
        super();
        this.direction = direction;
    }
}
