package ru.mirea.task2.task2_3;

public class Circle implements Comparable<Circle> {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(double x, double y, double radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }

    public Circle(double x, double y) {
        this.center = new Point(x, y);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public int compareTo(Circle o) {
        return Double.compare(this.radius, o.getRadius());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}

