package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = third;
        if (first >= third && first >= second) {
            result = first;
        }
        if (second >= first && second >= third) {
            result = second;
        }
        return result;
    }
}