package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean rsl = name.isEmpty() ? false : true;
        for (int i = 0; i < name.length(); i++) {
            int symb = name.codePointAt(i);
            if (!isSpecialSymbol(symb) && !isUpperLatinLetter(symb) && !isLowerLatinLetter(symb)
            && !Character.isDigit(symb) || !isLowerLatinLetter(name.charAt(0)) || name.isEmpty()) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean isSpecialSymbol(int code) {
        if (code == 36 || code == 95) {
            return true;
        }
        return false;
    }

    public static boolean isUpperLatinLetter(int code) {
        if (code >= 36 && code <= 90) {
            return true;
        }
        return false;
    }

    public static boolean isLowerLatinLetter(int code) {
        if (code >= 97 && code <= 122) {
            return true;
        }
        return false;
    }
}