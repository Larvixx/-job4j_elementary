package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when1020to4060then50() {
        double expected = 50;
        Point a = new Point(10, 20);
        Point b = new Point(40, 60);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2030to5070then50() {
        double expected = 50;
        Point a = new Point(20, 30);
        Point b = new Point(50, 70);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2533to7745then53dot37() {
        double expected = 53.36;
        Point a = new Point(25, 33);
        Point b = new Point(77, 45);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}