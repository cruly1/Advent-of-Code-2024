package io.github.cruly1.aoc2024.utils;

import io.github.cruly1.aoc2024.day01.PartOne;

import java.util.Objects;

public class FileNames {

    public static String getFileName(int day, String type) {
        return Objects.requireNonNull(PartOne.class.getClassLoader().getResource("day" + day + "/" + type + ".txt")).getPath();
    }
}
