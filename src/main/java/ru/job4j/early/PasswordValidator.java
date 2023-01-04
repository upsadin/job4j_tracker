package ru.job4j.early;

public class PasswordValidator {

    public static String validate(String password) throws IllegalArgumentException {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        if (password.toLowerCase().contains("qwerty")
                || password.toLowerCase().contains("password")
                || password.toLowerCase().contains("admin")
                || password.toLowerCase().contains("user")
                || password.contains("12345")
        ) {
            throw new IllegalArgumentException(
                    "Password shouldn't contain substrings: qwerty, 12345, password, admin, user"
            );
        }
        int upCase = 0;
        int lowCase = 0;
        int digit = 0;
        int symb = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                lowCase++;
            }
            if (Character.isUpperCase(password.charAt(i))) {
                upCase++;
            }
            if (Character.isDigit(password.charAt(i))) {
                digit++;
            }
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                symb++;
            }
        }
        if (upCase == 0) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (lowCase == 0) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (digit == 0) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (symb == 0) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        return password;
    }
}