package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when1020to4060then50() {
        double expected = 50;
        int x1 = 10;
        int y1 = 20;
        int x2 = 40;
        int y2 = 60;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2030to5070then50() {
        double expected = 50;
        int x1 = 20;
        int y1 = 30;
        int x2 = 50;
        int y2 = 70;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2533to7745then53() {
        double expected = 53.3666;
        int x1 = 25;
        int y1 = 33;
        int x2 = 77;
        int y2 = 45;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}