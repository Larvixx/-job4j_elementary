package ru.job4j.array;

public class SimpleStringEncoder {
    private static String rsl(int counter, String result, char symbol) {
        return counter == 1 ? result + symbol : result + symbol + counter;
    }

    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                result = rsl(counter, result, symbol);
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        return rsl(counter, result, symbol);
    }
}1