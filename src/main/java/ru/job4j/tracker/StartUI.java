package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        LocalDateTime rsl = item.getDateTime();
        System.out.println(rsl.format(formatter));
        Item item2 = new Item(1, "Paul");
        System.out.println(item2);
    }
}
