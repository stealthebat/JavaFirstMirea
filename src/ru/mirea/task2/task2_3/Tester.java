package ru.mirea.task2.task2_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Tester {
    private Circle[] circles;
    private int circlesSize;

    public Tester(Circle[] circles, int circlesSize) {
        this.circles = circles;
        this.circlesSize = circlesSize;
    }


    public Circle findSmallestCircle() {
        return Collections.min(Arrays.asList(circles), Circle::compareTo);
    }

    public Circle findLargestCircle() {
        return Collections.max(Arrays.asList(circles), Circle::compareTo);
    }

    public void sortCircles() {
        Arrays.sort(circles, Circle::compareTo);
    }
    @Override
    public String toString() {
        return "Tester{" +
                "circles=" + Arrays.toString(circles) +
                ", circlesSize=" + circlesSize +
                '}';
    }
}
