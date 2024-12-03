package io.github.cruly1.aoc2024.day03;

import io.github.cruly1.aoc2024.utils.FileNames;
import io.github.cruly1.aoc2024.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PartOne {

    private final static int dayNumber = 3;

    private final static String example = FileNames.getFileName(dayNumber, "example");
    private final static String input = FileNames.getFileName(dayNumber, "input");

    private static int mulResult = 0;

    public static void main(String[] args) {
//        List<String> lines = FileUtils.readLines(example);
        List<String> lines = FileUtils.readLines(input);

        String regex = "mul\\(\\d{1,3},\\d{1,3}\\)";
        Pattern pattern = Pattern.compile(regex);

        List<String> matches = new ArrayList<>();

        for (String line : lines) {
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                matches.add(matcher.group());
            }
        }

        for (String match : matches) {
            Multiplier multiplier = new Multiplier(match);
            mulResult += multiplier.mul();
        }

        System.out.println(mulResult);
    }
}
