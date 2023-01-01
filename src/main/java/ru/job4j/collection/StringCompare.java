package ru.job4j.collection;

import java.util.Comparator;
import java.lang.Math;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int diffLength = Integer.compare(left.length(), right.length());
            for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
                int tmp = Character.compare(left.charAt(i), right.charAt(i));
                if (tmp != 0) {
                    diffLength = tmp;
                    break;
                }
            }
        return diffLength;
    }
}
