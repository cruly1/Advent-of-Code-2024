package io.github.cruly1.aoc2024.day01;

import io.github.cruly1.aoc2024.utils.FileNames;
import io.github.cruly1.aoc2024.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class PartOne {

    private final static int dayNumber = 1;

    private final static String example = FileNames.getFileName(dayNumber, "example");
    private final static String input = FileNames.getFileName(dayNumber, "input");

    private static int distanceBetweenAll = 0;

    public static void main(String[] args) {
//        List<String> lines = FileUtils.readLines(example);
        List<String> lines = FileUtils.readLines(input);
        List<Integer> leftSide = new ArrayList<>();
        List<Integer> rightSide = new ArrayList<>();

        for (String line : lines) {
            String[] bothSides = line.split(" {3}");
            int leftSideNumber = Integer.parseInt(bothSides[0]);
            int rightSideNumber = Integer.parseInt(bothSides[1]);
            leftSide.add(leftSideNumber);
            rightSide.add(rightSideNumber);
        }

        leftSide.sort(Integer::compareTo);
        rightSide.sort(Integer::compareTo);

        for (int i = 0; i < leftSide.size(); i++) {
            Point p = new Point(leftSide.get(i), rightSide.get(i));
            distanceBetweenAll += p.calculateDistance();
        }

        System.out.println(distanceBetweenAll);
    }
}
