package io.github.cruly1.aoc2024.day02;

import io.github.cruly1.aoc2024.utils.FileNames;
import io.github.cruly1.aoc2024.utils.FileUtils;

import java.util.List;

/**
 * @author cruly1
 * read the lines from the input.txt (use example.txt for testing)
 * collect all safe lines into a variable
 * we say a line is safe when:
 * - it's containing elements either increasing or decreasing, both is not an option
 * - the next value if either greater/lower by minimum 1 and maximum 3
 * so for example 1 3 6 7 9 is safe because it's all increasing and the next value if always greater by maximum 3
 */
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
