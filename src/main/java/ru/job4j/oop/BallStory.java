package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare zayac = new Hare();
        Wolf seriy = new Wolf();
        Fox rizhaya = new Fox();
        zayac.tryEat(kolobok);
        seriy.tryEat(kolobok);
        rizhaya.tryEat(kolobok);
    }
}
