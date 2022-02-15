package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void when1234then4() {
        int expected = 4;
        int rsl = Max.max(1, 2, 3, 4);
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void when063then6() {
        int expected = 6;
        int rsl = Max.max(0, 6, 3);
        Assert.assertEquals(rsl, expected);
    }

    @Test
    public void when91then9() {
        int expected = 9;
        int rsl = Max.max(9, 1);
        Assert.assertEquals(rsl, expected);
    }
}