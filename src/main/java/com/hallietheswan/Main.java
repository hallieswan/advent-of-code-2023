package com.hallietheswan;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.TreeMap;

public class Main {

    private static TreeMap<Integer, Day> days = new TreeMap<>();

    static {
        try {
            days.put(1, new Day01("day01_input.txt"));
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Main() throws URISyntaxException, IOException {
    }

    public static void main(String[] args) throws URISyntaxException, IOException {
        for (int day : days.keySet()) {
            Day thisDay = days.get(day);
            System.out.printf("Day%02d ------------\n", day);
            System.out.print("Part 1: ");
            System.out.println(thisDay.part1());
            System.out.print("Part 2: ");
            System.out.println(thisDay.part2());
        }
    }
}