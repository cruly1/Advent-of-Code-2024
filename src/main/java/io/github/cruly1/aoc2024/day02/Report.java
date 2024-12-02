package io.github.cruly1.aoc2024.day02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Report {
    private final List<Integer> list = new ArrayList<>();

    public Report(String line) {
        String[] parts = line.split(" ");
        for (String part : parts) {
            this.list.add(Integer.parseInt(part));
        }
    }

    // part one
    public boolean isReportSafePartOne() {
        return (isAllIncreasing() || isAllDecreasing()) && isDifferenceMaxThree();
    }

    private boolean isAllIncreasing() {
        return list.stream().sorted().toList().equals(list);
    }

    private boolean isAllIncreasing(List<Integer> list) {
        return list.stream().sorted().toList().equals(list);
    }

    private boolean isAllDecreasing() {
        List<Integer> tmpList = new ArrayList<>(list);
        Collections.reverse(tmpList);
        return isAllIncreasing(tmpList);
    }

    private boolean isDifferenceMaxThree() {
        return checkDifference(list);
    }

    // part two
    public boolean isReportSafePartTwo() {
        if (isReportSafePartOne()) {
            return true;
        }

        List<Integer> original = new ArrayList<>(list);

        for (int i = 0; i < original.size(); i++) {
            List<Integer> tmpList = new ArrayList<>(original);
            tmpList.remove(i);

            if (isAllIncreasing(tmpList) || isAllDecreasing(tmpList)) {
                if (isDifferenceMaxThree(tmpList)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isDifferenceMaxThree(List<Integer> list) {
        return checkDifference(list);
    }

    private boolean checkDifference(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (Math.abs(list.get(i) - list.get(i + 1)) > 3) {
                return false;
            }

            if (list.get(i) - list.get(i + 1) == 0) {
                return false;
            }
        }

        return true;
    }

    private boolean isAllDecreasing(List<Integer> list) {
        List<Integer> tmpList = new ArrayList<>(list);
        Collections.reverse(tmpList);
        return isAllIncreasing(tmpList);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
