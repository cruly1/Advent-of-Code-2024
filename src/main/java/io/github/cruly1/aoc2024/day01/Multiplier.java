package io.github.cruly1.aoc2024.day01;

public class Multiplier {
    private final int left;
    private final int numberOfAppearances;

    public Multiplier(int left, int numberOfAppearances) {
        this.left = left;
        this.numberOfAppearances = numberOfAppearances;
    }

    public int multiply() {
        return left * numberOfAppearances;
    }
}
