package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private int age;

    public Surgeon(String name, String surname, String education, String birthday, String direction, int age) {
        super(name, surname, education, birthday, direction);
        this.age = age;
    }
}
