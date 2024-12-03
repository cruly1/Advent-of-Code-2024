package io.github.cruly1.aoc2024.day03;

public class Multiplier {
    private int first;
    private int second;

    public Multiplier(String match) {
        String[] parts = match.substring(match.indexOf("(") + 1, match.indexOf(")")).split(",");
        this.first = Integer.parseInt(parts[0]);
        this.second = Integer.parseInt(parts[1]);
    }

    public int mul() {
        return first * second;
    }
}
