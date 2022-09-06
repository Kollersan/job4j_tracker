package ru.job4j.early;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PasswordValidatorTest {

    @Test
    public void whenPasswordIsNull() {
        try {
            PasswordValidator.Validate("");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("password must be more than 0"));
        }
    }

    @Test
    public void whenPasswordInBanList() {
        try {
            PasswordValidator.Validate("adMin");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("chose a harder password"));
        }
    }
    @Test
    public void whenPasswordLengthOutOfRange() {
        try {
            PasswordValidator.Validate("Ajah");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("Password must be less than 32 symbols and more than 8 symbols"));
        }
    }
    @Test
    public void whenPasswordLowerCase() {
        try {
            PasswordValidator.Validate("aaaaaaaa");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("password must have 1 or more uppercase symbol"));
        }
    }
    @Test
    public void whenPasswordUpperCase() {
        try {
            PasswordValidator.Validate("AAAAAAAA");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("password must have 1 or more Lowercase symbol"));
        }
    }
    @Test
    public void whenPasswordDidNotHaveNumbers() {
        try {
            PasswordValidator.Validate("AAAAfAAA");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("password must have 1 or more numbers"));
        }
    }
    @Test
    public void whenPasswordDidNotHaveSpecialSymbol() {
        try {
            PasswordValidator.Validate("AAAAfAAA1");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("password must have 1 or more special symbols"));
        }
    }
}