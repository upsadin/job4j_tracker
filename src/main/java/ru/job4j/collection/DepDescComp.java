package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] o1s = o1.split("/");
        String[] o2s = o2.split("/");
        int rsl = o2s[0].compareTo(o1s[0]);
/*        if (rsl == 0) {
            o1 = o1.substring(o1s[0].length());
            o2 = o2.substring(o1s[0].length());
            rsl = o1.compareTo(o2);
        }*/
        return rsl != 0 ? rsl : o1.compareTo(o2);
    }
}
