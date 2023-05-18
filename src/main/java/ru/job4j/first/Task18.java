package ru.job4j.first;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double r = input.nextDouble();
        double perimetr = 4*a;
        double dlinna = 2*(Math.PI)*r;
        double circle = Math.PI* Math.pow(r,2);
        String out = String.format("%.1f%n%.1f%n%.1f"
                ,perimetr,dlinna,circle);
        System.out.println(out);
    }
}