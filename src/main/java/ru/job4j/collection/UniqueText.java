package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] duplicate = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String orig : origin) {
            check.add(orig);
        }
        for (String dupl : duplicate) {
            if (!check.contains(dupl)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
