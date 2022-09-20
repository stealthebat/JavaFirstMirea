package ru.mirea.task2.task2_6;

public class Circle implements Comparable<Circle> {
    private static final double PI = 3.14;

    private double radius;
    private String color;

    public Circle( double x, double y, double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return 2 * PI * this.radius;
    }

    public double getArea() {
        return PI * this.radius * this.radius;
    }

    @Override
    public int compareTo(Circle o) {
        return Double.compare(this.radius, o.getRadius());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

}
