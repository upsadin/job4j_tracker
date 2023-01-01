package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] s1 = o1.split(". ");
        String[] s2 = o2.split(". ");
        return Integer.compare(Integer.parseInt(s1[0]), Integer.parseInt(s2[0]));
    }
}
