package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String language;

    public Programmer(){
    }

    public Programmer(String language) {
        super();
        this.language = language;
    }
}
