package com.hallietheswan;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class Day01 implements Day {
    private List<String> input;

    public Day01(String fileName) throws URISyntaxException, IOException {
        input = Utility.readFileLinesFromResources(fileName);
    }

    @Override
    public Object part1() {
        int sum = 0;
        for (String line : input) {
            sum += getLineValue(line);
        }
        return sum;
    }

    private int getLineValue(String line) {
        int sum = 0;

        for (char c : line.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c) * 10;
                break;
            }
        }

        for (int i = line.length() - 1; i >= 0; i--) {
            char c = line.charAt(i);
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
                break;
            }
        }

        return sum;
    }

    @Override
    public Object part2() {
        return -1;
    }

}
