package ru.job4j.array;

import java.util.Arrays;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            result[index] = array[array.length - index - 1];
        }
        return result;
    }

    public static void main(String[] args) {
     int [] number = new int[] {1,2,3,3,5,6,6,7,78,8,8,7};
     int [] roll =  rollback(number);
        System.out.println(Arrays.stream(roll).toArray());
        for (int i = 0; i < roll.length; i++) {
            System.out.println(roll[i]);
        }
    }
}