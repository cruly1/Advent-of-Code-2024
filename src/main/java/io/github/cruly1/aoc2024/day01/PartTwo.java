package io.github.cruly1.aoc2024.day01;

import io.github.cruly1.aoc2024.utils.FileNames;
import io.github.cruly1.aoc2024.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class PartTwo {

    private final static int dayNumber = 1;

    private final static String example = FileNames.getFileName(dayNumber, "example");
    private final static String input = FileNames.getFileName(dayNumber, "input");

    private static int totalAppearancesMultiplied = 0;

    public static void main(String[] args) {
//        List<String> lines = FileUtils.readLines(example);
        List<String> lines = FileUtils.readLines(input);
        List<Integer> leftSide = new ArrayList<>();
        List<Integer> rightSide = new ArrayList<>();

        for (String line : lines) {
            String[] bothSides = line.split(" {3}");
            leftSide.add(Integer.parseInt(bothSides[0]));
            rightSide.add(Integer.parseInt(bothSides[1]));
        }

        for (int leftNum : leftSide) {
            int numberOfAppearances = 0;
            for (int rightNum : rightSide) {
                if (leftNum == rightNum) {
                    numberOfAppearances++;
                }
            }
            Multiplier multiplier = new Multiplier(leftNum, numberOfAppearances);
            totalAppearancesMultiplied += multiplier.multiply();
        }

        System.out.println(totalAppearancesMultiplied);
    }
}
