package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("11 game.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "First player" : "Second player";
            System.out.println(player + " введите число от 1 до 3");
            int matches = Integer.parseInt(input.nextLine());
            if (matches > 0 && matches <= 3 && matches <= count) {
                turn = !turn;
                count -= matches;
                System.out.println(player + " взял " + matches
                        + " спичек, на столе осталось " + count);
            } else {
                System.out.println("Error");
            }
        }
        if (!turn) {
            System.out.println("1st win");
        } else {
            System.out.println("2 win");
        }
    }
}
