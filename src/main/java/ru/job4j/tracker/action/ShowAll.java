package ru.job4j.tracker.action;

import ru.job4j.tracker.*;

import java.util.List;

public class ShowAll implements UserAction {
    private final Output out;

    public ShowAll(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        out.println("=== Show all items ===");
        List<Item> items = tracker.findAll();
        if (items.size() > 0) {
            for (Item rsl : items) {
                out.println(rsl);
            }
        } else {
            out.println("Хранилище еще не содержит заявок");
        }
        return true;
    }
}
