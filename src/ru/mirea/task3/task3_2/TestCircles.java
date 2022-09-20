package ru.mirea.task3.task3_2;

import ru.mirea.task2.task2_3.Circle;
import ru.mirea.task2.task2_3.Tester;

public class TestCircles {
    public static void main(String[] args) {
        Circle c1 = new Circle(1, 1, 10);
        Circle c2 = new Circle(0, 0, 5);
        Circle c3 = new Circle(10, 10, 1);
        Tester tester = new Tester(new Circle[]{c1, c2, c3}, 3);
        System.out.println(tester.findLargestCircle());
        System.out.println(tester.findSmallestCircle());
        System.out.println(tester);
        tester.sortCircles();
        System.out.println(tester);
    }
}
