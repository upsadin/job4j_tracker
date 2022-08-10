package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean rsl = !name.isEmpty() && isLowerLatinLetter(name.charAt(0));
        if (rsl) {
            for (int i = 1; i < name.length(); i++) {
                int symb = name.codePointAt(i);
                if (!isSpecialSymbol(symb) && !isUpperLatinLetter(symb) && !isLowerLatinLetter(symb)
                        && !Character.isDigit(symb)) {
                    rsl = false;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean isSpecialSymbol(int code) {
         return (code == 36 || code == 95);
    }

    public static boolean isUpperLatinLetter(int code) {
        return (code >= 65 && code <= 90);
    }

    public static boolean isLowerLatinLetter(int code) {
        return (code >= 97 && code <= 122);
    }
}