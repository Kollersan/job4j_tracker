package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book kolobok = new Book("kolobok", 20);
        Book teremok = new Book("teremok", 25);
        Book chippolino = new Book("chippolino", 30);
        Book clean = new Book("Clean code", 100);
        Book[] books = new Book[4];
        books[0] = kolobok;
        books[1] = teremok;
        books[2] = chippolino;
        books[3] = clean;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println("Книга " + bk.getName() + " "
                    + bk.getAmountPages() + " pages");
        }
        System.out.println();
        Book[] safe = new Book[1];
        safe[0] = books[0];
        books[0] = books[3];
        books[3] = safe[0];
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println("Книга " + bk.getName() + " "
                    + bk.getAmountPages() + " pages");
        }
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " "
                        + bk.getAmountPages());
            }
        }
    }
}
