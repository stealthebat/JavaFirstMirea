package ru.mirea.task2.task2_6;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1, 0, 3, "Red");
        System.out.println(circle1.toString());
        circle1.setColor("Blue");
        circle1.setRadius(10);
        System.out.println(circle1.toString());
        Circle circle2 = new Circle(0, 0, 4, "Blue");
        System.out.print("Circle2 length and area: ");
        System.out.println(circle2.getLength() + " " + circle2.getArea());
        System.out.println("Circles radiuses: " + circle1.getRadius() + " " + circle2.getRadius());
        if (circle1.compareTo(circle2) > 0) {
            System.out.println("Circle1 is bigger");
        }
        else {
            System.out.println("Circle2 is bigger");
        }
    }
}
