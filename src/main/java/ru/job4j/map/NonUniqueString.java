package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            int n = map.getOrDefault(string, 0);
            map.put(string, n + 1);
        }
        Map<String, Boolean> rsl = new HashMap<>();
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            rsl.put(key, value >= 2 ? true : false);
        }
        return rsl;
    }
}