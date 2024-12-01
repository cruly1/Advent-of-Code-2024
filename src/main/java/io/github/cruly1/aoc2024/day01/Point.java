package io.github.cruly1.aoc2024.day01;

public class Point {
    private final int left;
    private final int right;

    public Point(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int calculateDistance() {
        return Math.abs(this.left - this.right);
    }
}
