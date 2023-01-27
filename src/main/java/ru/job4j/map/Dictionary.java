package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String string : strings) {
            char s = string.charAt(0);
            rsl.putIfAbsent(String.valueOf(s), new ArrayList<>());
        }
        for (String string : strings) {
            char s = string.charAt(0);
            for (Map.Entry<String, List<String>> map : rsl.entrySet()) {
                if (String.valueOf(s).equals(map.getKey())) {
                    rsl.get(map.getKey()).add(string);
                }
            }
        }
        return rsl;
    }
}