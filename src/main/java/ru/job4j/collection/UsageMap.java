package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> data = new HashMap<>();
        data.put("parsentev@yandex.ru", "Petr Arsentev");
        for (String key : data.keySet()) {
            String value = data.get(key);
            System.out.println("key: " + key + ", Name: " + value);
        }
        System.out.println();
        for (Map.Entry<String, String> all : data.entrySet()) {
            String key = all.getKey();
            String value = all.getValue();
            System.out.println("key: " + key + ", Name: " + value);
        }
    }
}
