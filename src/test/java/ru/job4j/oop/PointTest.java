package ru.job4j.oop;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
    Point a = new Point(0, 0);
    Point b = new Point(2, 0);
    double expected = 2;
    double rsl = a.distance(b);
    Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when11to20then1point41() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 0);
        double expected = 1.41;
        double rsl = a.distance(b);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when12to24then2point23() {
        Point a = new Point(1, 2);
        Point b = new Point(2, 4);
        double expected = 2.23;
        double rsl = a.distance(b);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}