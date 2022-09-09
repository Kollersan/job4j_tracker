package ru.job4j.early;

import java.util.Locale;

public final class PasswordValidator {
    public static String validate(String password) {
        if (password.length() == 0) {
            throw new IllegalArgumentException("password must be more than 0");
        }
        String[] banlist = new String[] {"qwerty", "admin", "12345678", "password", "user"};
        for (String s : banlist) {
            if (s.equalsIgnoreCase(password)) {
                throw new IllegalArgumentException("chose a harder password");
            }
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password must be less than 32 symbols and more than 8 symbols");
        }
        if (password.equals(password.toLowerCase(Locale.ROOT))) {
            throw new IllegalArgumentException("password must have 1 or more uppercase symbol");
        }
        if (password.equals(password.toUpperCase(Locale.ROOT))) {
            throw new IllegalArgumentException("password must have 1 or more Lowercase symbol");
        }
        int numberscount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) < '9' && password.charAt(i) > '0') {
                numberscount++;
            }
            if (numberscount > 0) {
                break;
            }
        }
        if (numberscount == 0) {
            throw new IllegalArgumentException("password must have 1 or more numbers");
        }
        int symbolscout = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) > '/') {
                symbolscout++;
            }
            if (symbolscout > 0) {
                break;
            }
        }
        if (symbolscout == 0) {
        throw new IllegalArgumentException("password must have 1 or more special symbols");
        }
        return password;
    }
}
