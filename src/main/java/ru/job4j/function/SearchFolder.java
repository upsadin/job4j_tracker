package ru.job4j.function;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class SearchFolder {
    public List<Folder> filter(List<Folder> list, Predicate<Folder> pred) {
        List<Folder> rsl = new ArrayList<>();
        for (Folder f : list) {
            if (pred.test(f)) {
                rsl.add(f);
            }
        }
        return rsl;
    }
}
