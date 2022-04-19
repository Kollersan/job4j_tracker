package ru.job4j.pojo;

public class Book {
    private String name;
    private int amountPages;

    public Book(String name, int amountPages) {
        this.name = name;
        this.amountPages = amountPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountPages() {
        return amountPages;
    }

    public void setAmountPages(int amountPages) {
        this.amountPages = amountPages;
    }
}
