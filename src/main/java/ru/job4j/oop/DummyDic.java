package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return eng;
    }

    public static void main(String[] args) {
        DummyDic toshiba = new DummyDic();
        String say = toshiba.engToRus("abba");
        System.out.println("Неизвестное слово. " + say);
    }
}
