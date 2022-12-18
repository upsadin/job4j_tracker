package ru.job4j.tracker;

import org.junit.Assert;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    @Test
    public void whenIncreaseSort() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("item1"));
        items.add(new Item("item3"));
        items.add(new Item("item2"));
        items.add(new Item("item7"));
        List<Item> expected = Arrays.asList(
                new Item("item1"),
                new Item("item2"),
                new Item("item3"),
                new Item("item7")
        );
        Collections.sort(items, new ItemAscByName());
        assertThat(items).isEqualTo(expected);
    }

    @Test
    public void whenDecreaseSort() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("item1"));
        items.add(new Item("item3"));
        items.add(new Item("item2"));
        items.add(new Item("item7"));
        List<Item> expected = Arrays.asList(
                new Item("item7"),
                new Item("item3"),
                new Item("item2"),
                new Item("item1")
        );
        Collections.sort(items, new ItemDescByName());
        assertThat(items).isEqualTo(expected);
    }
}