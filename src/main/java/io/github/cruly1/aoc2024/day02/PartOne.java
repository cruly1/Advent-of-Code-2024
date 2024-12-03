package io.github.cruly1.aoc2024.day02;

import io.github.cruly1.aoc2024.utils.FileNames;
import io.github.cruly1.aoc2024.utils.FileUtils;

import java.util.List;

public class PartOne {

    private final static int dayNumber = 2;

    private final static String example = FileNames.getFileName(dayNumber, "example");
    private final static String input = FileNames.getFileName(dayNumber, "input");

    private static int safeReportCounter = 0;

    public static void main(String[] args) {
//        List<String> lines = FileUtils.readLines(example);
        List<String> lines = FileUtils.readLines(input);

        for (String line : lines) {
            Report report = new Report(line);
            if (report.isReportSafePartOne()) {
                safeReportCounter++;
            }
        }

        System.out.println(safeReportCounter);
    }
}
