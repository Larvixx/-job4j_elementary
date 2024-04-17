package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        short in = 170;
        double expected = 69;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);

    }

    // Testing womanWeight method with height as the minimum value (0).
    @Test
    public void testWomanWeightWithZeroHeight() {
        // Arrange
        short in = 0;
        double expected = -126.5;

        // Act
        double out = Fit.womanWeight(in);

        // Assert
        Assert.assertEquals(expected, out, 0.01);
    }

    // Testing manWeight method with height as the minimum value (0).
    @Test
    public void testManWeightWithZeroHeight() {
        // Arrange
        short in = 0;
        double expected = -115.0;

        // Act
        double out = Fit.manWeight(in);

        // Assert
        Assert.assertEquals(expected, out, 0.01);
    }


    // Test the manWeight method with a height of 160, expecting a weight of 52.0.
    @Test
    public void whenMan160Then69() {
        // Arrange
        short in = 160;
        double expected = 69.0;

        // Act
        double out = Fit.manWeight(in);

        // Assert
        Assert.assertEquals(expected, out, 0.01);
    }
}