package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        int rsl = max(second, third);
        return  first > rsl ? first : rsl;
    }

    public static int max(int first, int second, int third, int fourth) {
        int rsl = max(second, third, fourth);
        return first > rsl ? first : rsl;
    }
}