package ru.job4j.early;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PasswordValidatorTest {

    @Test
    public void whenPasswordIsNull() {
        try {
            PasswordValidator.validate("");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("password must be more than 0"));
        }
    }

    @Test
    public void whenPasswordInBanList() {
        try {
            PasswordValidator.validate("adMin");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("chose a harder password"));
        }
    }

    @Test
    public void whenPasswordLengthOutOfRange() {
        try {
            PasswordValidator.validate("Ajah");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("Password must be less than 32 symbols and more than 8 symbols"));
        }
    }

    @Test
    public void whenPasswordLowerCase() {
        try {
            PasswordValidator.validate("aaaaaaaa");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("password must have 1 or more uppercase symbol"));
        }
    }

    @Test
    public void whenPasswordUpperCase() {
        try {
            PasswordValidator.validate("AAAAAAAA");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("password must have 1 or more Lowercase symbol"));
        }
    }

    @Test
    public void whenPasswordDidNotHaveNumbers() {
        try {
            PasswordValidator.validate("AAAAfAAA");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("password must have 1 or more numbers"));
        }
    }

    @Test
    public void whenPasswordDidNotHaveSpecialSymbol() {
        try {
            PasswordValidator.validate("AAAAfAAA1");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("password must have 1 or more special symbols"));
        }
    }
}