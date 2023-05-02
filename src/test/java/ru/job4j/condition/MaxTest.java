package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax6To6Then6() {
        int first = 6;
        int second = 6;
        int result = Max.max(first, second);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2To3Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To3To4To5Then5() {
        int first = 2;
        int second = 3;
        int third = 4;
        int fourth = 5;
        int result = Max.max(first, second, third, fourth);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}
